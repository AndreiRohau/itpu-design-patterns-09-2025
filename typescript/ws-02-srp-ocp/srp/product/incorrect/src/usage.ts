console.log("works")

import { Product } from './Product';

var product: Product = new Product("beans", 100, 0.1);

var tax = product.calculateTax()

console.log("tax", tax)
