console.log("works")  
console.log("Imperative impl")

// [CONTEXT]
class PaymentProcessor {
    strategy
    constructor(strategy) {
        this.strategy = strategy;
    }

    setStrategy(strategy) {
        this.strategy = strategy;
    }

    processPayment(amount) {
        this.strategy.pay(amount);
    }
}

// [STRATEGY]
abstract class PaymentStrategy {
	abstract pay(amount): void
}

// [CONCRETE STRATEGY]
class PayPalPayment extends PaymentStrategy {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using PayPal.`);
    }
}

// [CONCRETE STRATEGY]
class CreditCardPayment extends PaymentStrategy {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using Credit Card.`);
    }
}

// [CONCRETE STRATEGY]
class BitcoinPayment extends PaymentStrategy {
    pay(amount) {
        console.log(`Processing a payment of ${amount} using Bitcoin.`);
    }
}

const paymentProcessor = new PaymentProcessor(null)
const payPalPaymentStrategy: PaymentStrategy = new PayPalPayment()
const creditCardPaymentStrategy: PaymentStrategy = new CreditCardPayment()
const bitcoinPaymentStrategy: PaymentStrategy = new BitcoinPayment()

paymentProcessor.setStrategy(payPalPaymentStrategy)
paymentProcessor.processPayment(1)
paymentProcessor.setStrategy(creditCardPaymentStrategy)
paymentProcessor.processPayment(2)
paymentProcessor.setStrategy(bitcoinPaymentStrategy)
paymentProcessor.processPayment(3)



console.log('----')

const payPalPayment = new PaymentProcessor(new PayPalPayment());
const creditCardPayment = new PaymentProcessor(new CreditCardPayment());
const bitcoinPayment = new PaymentProcessor(new BitcoinPayment());

payPalPayment.processPayment(100); // Processing a payment of 100 using PayPal.
creditCardPayment.processPayment(200); // Processing a payment of 200 using Credit Card.
bitcoinPayment.processPayment(300); // Processing a payment of 300 using Bitcoin.

console.log('----')
const ppp = new PayPalPayment()
const ccp = new CreditCardPayment()
const bp = new BitcoinPayment()

const contextPaymentProcessor = new PaymentProcessor(ppp)

contextPaymentProcessor.processPayment(111)
contextPaymentProcessor.strategy = ccp
contextPaymentProcessor.processPayment(222)
contextPaymentProcessor.strategy = bp
contextPaymentProcessor.processPayment(333)