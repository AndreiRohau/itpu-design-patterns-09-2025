console.log("works")

import { TaxCalculator } from './TaxCalculator';
import { IProduct } from './IProduct'
import { IProductImpl } from './IProductImpl'

var product: IProduct = new IProductImpl("beans", "coffee", 100, 0.1);

var taxCalc: TaxCalculator = new TaxCalculator();

var tax = taxCalc.calculateTax(product)

console.log("tax", tax)
