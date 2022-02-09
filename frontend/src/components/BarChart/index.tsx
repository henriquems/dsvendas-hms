import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { VendaSucesso } from 'types/venda';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels: {
        categories : string[]
    };
    series: SeriesData[];
}

function BarChart() {
    
    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []                   
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/vendas/sucesso-vendas-por-vendedor`)
        .then(response => {
            const data = response.data as VendaSucesso[];
            const myLabels = data.map(x => x.nomeVendedor);
            const mySerires = data.map(x => round(100.0 * x.totalNegociosFechados / x.totalVisitas, 1)); 

            setChartData({
                labels: {
                    categories: myLabels
                },
                series: [
                    {
                        name: "% Seucesso",
                        data: mySerires                   
                    }
                ]
            });
        });
    }, [])

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    return (
      <Chart 
        options={{ ...options, xaxis: chartData.labels}}
        series={chartData.series}
        type="bar"
        height="240"
      />  
    );
}

export default BarChart;