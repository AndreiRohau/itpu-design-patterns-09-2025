import {IProduct} from "./IProduct"

export class IProductImpl implements IProduct {
    name: string
    private _name: string
    type: string
    private _type: string
    price: number
    private _price: number

    constructor(name: string, type: string, price: number) {
        this.name = name
        this._name = name
        this.type = type
        this._type = type
        this.price = price
        this._price = price
    }

    public getName() {
        return this._name
    }

    public setName(name: string) {
        this._name = name
    }

    public getType() {
        return this._type
    }

    public setType(type: string) {
        this._type = type
    }

    public getPrice() {
        return this._price
    }

    public setPrice(price: number) {
        this._price = price
    }
}
