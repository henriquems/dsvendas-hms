import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { VendaSoma } from 'types/venda';
import { BASE_URL } from 'utils/redirects';

type ChartData = {
    labels: string[];
    series: number[];
}

function DonutChart() {
    const [chartData, setChartData] = useState<ChartData>({labels : [], series: []});
    
    useEffect(() => {
        axios.get(`${BASE_URL}/vendas/total-vendas-por-vendedor`)
        .then(response => {
            const data = response.data as VendaSoma[];
            const myLabels = data.map(x => x.nomeVendedor);
            const mySerires = data.map(x => x.soma); 

            setChartData({labels : myLabels, series : mySerires});
        });
    }, [])
    
    const options = {
        legend: {
            show: true
        }
    }
    
    return (
        <Chart 
          options={{ ...options, labels: chartData.labels}}
          series={chartData.series}
          type="donut"
          height="240"
        />  
      );
}

export default DonutChart;