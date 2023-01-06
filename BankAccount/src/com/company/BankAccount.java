package com.company;

public class BankAccount {

    private double balance;
    private int accNum;
    private String customerName;
    private String email;
    private int phoneNum;
    private double withdrawAmount;
    private double depositAmount;

    public BankAccount(String customerName, int accountNum, double withdrawAmount, double depositAmount) {
        this.customerName = customerName;
        this.accNum = accountNum;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        if(balance - withdrawAmount > 0) {
            balance -= withdrawAmount;
            return withdrawAmount;
        } else {
            System.out.println("Not enough money");
            return withdrawAmount;
        }
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int num) {
        this.accNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

}
