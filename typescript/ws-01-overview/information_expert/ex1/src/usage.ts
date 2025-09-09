console.log("works")  

import { IProduct } from './IProduct'
import { IProductImpl } from './IProductImpl'
import { ShoppingCart } from './ShoppingCart'

console.log('==========================')
var iphone: IProduct = new IProductImpl("iphone", "phone", 1000.0);
var ipad: IProduct = new IProductImpl("ipad", "tablet", 2000.0);
var macbook: IProduct = new IProductImpl("macbook", "laptop", 3000.0);

var shoppingCart: ShoppingCart = new ShoppingCart();

shoppingCart.addProductToCart(iphone);
shoppingCart.addProductToCart(ipad);
shoppingCart.addProductToCart(macbook);

var totalPrice: number = shoppingCart.getTotalPrice(0.9); // -10% discount

console.log(totalPrice);
console.log('==========================')
