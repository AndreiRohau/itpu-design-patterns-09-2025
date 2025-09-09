console.log("works")

import { Product } from './Product';

var product: Product = new Product("beans", 100, 10);

var tax = product.calculateTax()

console.log("taks", tax)