import { IProduct } from './IProduct'

export class TaxCalculator {
    constructor() {
    }

    public calculateTax(product: IProduct) {
        return product.price * product.taxRate;
    }
}
