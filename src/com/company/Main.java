package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        for (double i = 0;  ; i++) {
                                                       //System.out.println("Не правильная сумма");
                                                            //Scanner scanner = new Scanner(System.in);
                                                               //double amount = scanner.nextDouble();
            try{
                bankAccount.withDraw(6000);

            }catch (LimitException e){

                e.printStackTrace();
                System.out.println(e.getMessage());


            }finally {
                System.out.println("Возмите карту");

            }break;

        }

    }
}
/* Scanner s = new Scanner(System.in);  //Что такое "in"
        double amount = s.nextDouble();
        System.out.println("Не правильная сумма");
        try {
            amount.setAmount(amount)
        }*/