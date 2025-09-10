console.log("works")

import { IProduct } from './IProduct'
import { IProductImpl } from './IProductImpl'

var product: IProduct = new IProductImpl("beans", "coffee", 100, 0.1);

var tax = product.calculateTax()

console.log("tax", tax)
