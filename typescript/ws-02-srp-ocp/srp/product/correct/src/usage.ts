console.log("works")

import { Product } from './Product';
import { TaxCalculator } from './TaxCalculator';

var product: Product = new Product("beans", 100, 10);
var taxCalc: TaxCalculator = new TaxCalculator();

var tax = taxCalc.calculateTax(product)

console.log("taks", tax)