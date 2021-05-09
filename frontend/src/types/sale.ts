import { Seller } from "./seller"

export type Sale = {
    id: 21,
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type SaleSum = {
    saleName: string;
    sum: number;
}

export type SaleSuccess = {
    sallerName: string;
    visited: number;
    deals: number;
}