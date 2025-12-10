package com.arohau.chainOfResponsibility.ex2;

public class App {

    public static void main(String[] args) {
        var request1 = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var request2 = new WithdrawalRequest(30, WithdrawalRequest.Currency.USD);
        var request3 = new WithdrawalRequest(10000, null);
        var atm = buildAtmChain();
        atm.dispense(request1);
        atm.dispense(request2);
        atm.dispense(request3);
    }

    private static ATM buildAtmChain() {
        var euroATM = new EuroATM(null);
        var usdATM = new UsDollarATM(euroATM);
        return usdATM;
    }

}
