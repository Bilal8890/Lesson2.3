package com.company;

public class BankAccount {
    private double amount;
    public void deposit(double sum){
        amount = amount + sum;
    }
    public void withDraw(int sum) throws LimitException {
        if(amount < sum){
            throw new LimitException("Недостаточно средств ", getAmount());
        }
        else{
            amount = amount - sum;
        }

    }

    public double getAmount() {
        return amount;
    }
}
