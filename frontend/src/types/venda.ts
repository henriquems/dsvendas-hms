export type Venda = {
    id: number;
    visited: number,
    deals: number,
    amount: number,
    date: string,
    vendedor: {
        id: number,
        name: string
    }
}

export type VendaPagina = {
    content?: Venda[];
    last: boolean;
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type VendaSoma = {
    nomeVendedor: string;
    soma: number;
}

export type VendaSucesso = {
    nomeVendedor: string;
    totalVisitas: number;
    totalNegociosFechados: number;
}