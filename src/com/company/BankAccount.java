package com.company;

public class BankAccount {
    double amount;//Остаток на счете

    public double getAmount() {  // возвращает текущий остаток на счете
        return amount;
    }

    public void deposit(double sum) {// положить деньги на счет
        if (sum > 0) {
            amount = amount + sum;
            System.out.println("Деньги на счете " + amount);
        }
    }
    public void withDraw(int sum) throws LimitException {  //снимает указанную сумму со счета
        if (getAmount() > 0) {
            System.out.println("Снято " + sum);
            System.out.println("Остаток на счете " + (amount = amount - sum));
            if (getAmount() < sum) {
                System.out.println("Снято " + amount);
                amount = amount - amount;
                System.out.println("На счете " + amount);
                if (getAmount() == 0) {
                    System.out.println("Недостаточно средств на карте " + amount);
                }
            }

        } else {

        }
    }
}
 /* Scanner s = new Scanner(System.in);  //Что такое "in"
        double amount = s.nextDouble();
        System.out.println("Не правильная сумма");
        try {
            amount.setAmount(amount)
        }*/