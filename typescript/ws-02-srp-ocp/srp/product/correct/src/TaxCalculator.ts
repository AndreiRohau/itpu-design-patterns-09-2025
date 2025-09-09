import { Product } from './Product'

export class TaxCalculator {
    constructor() {
    }

    public calculateTax(product: Product) {
        return product.getPrice() * product.getTaxRate();
    }
}
