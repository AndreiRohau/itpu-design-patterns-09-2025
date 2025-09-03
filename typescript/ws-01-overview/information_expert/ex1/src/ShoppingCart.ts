import {IProduct} from "./IProduct"

export class ShoppingCart {
    products: IProduct[]

    constructor() {
        this.products = []
    }

    addProductToCart(product: IProduct) {
        this.products.push(product)
    }

    getTotalPrice(discount: number): number {
        let total = 0.0
        for (const product of this.products) {
            total += product.price
        }
        return total * discount
    }
}
