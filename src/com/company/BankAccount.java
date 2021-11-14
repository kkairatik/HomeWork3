package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = getAmount() + sum;
    }



    public void withDraw(double sum) throws LimitException {
        amount = getAmount() - sum;
        if (sum > getAmount()){
            amount = 0;
            throw new LimitException("На вашем счету недастаточно средств");
        }




    }
}
