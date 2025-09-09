export class Product {
  constructor(private title: string, private price: number, private taxRate: number) {
  }

  public setTitle(title: string) {
    this.title = title
  }

  public setPrice(price: number) {
    this.price = price
  }

  public setTaxRate(taxRate: number) {
    this.taxRate = taxRate
  }

  public getTitle() {
    return this.title
  }

  public getPrice() {
    return this.price
  }

  public getTaxRate() {
    return this.taxRate
  }

}
