package com.company;


import jdk.jfr.DataAmount;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount(20000);

        while (true){
            try{
                account.withDraw(6000);
                System.out.println(account.getAmount());
            }catch (LimitException e){
                System.out.println(e.getMessage());
                if (account.getAmount() < 6000){
                    try {
                        account.withDraw(account.getAmount());
                    }catch (LimitException e2){
                        e2.printStackTrace();
                    }
                }
                break;
            }

        }
    }
}
