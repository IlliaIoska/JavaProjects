package com.company;

public class Main {

    public static void main(String[] args) {


        BankAccount account = new BankAccount("Vincere", 123, 15, 14);
        System.out.println(account.getAccNum());
        System.out.println(account.getBalance());
        System.out.println(account.getWithdrawAmount());

        VipCusotmer vipCusotmer = new VipCusotmer();
        System.out.println(vipCusotmer.getName());
    }
}
