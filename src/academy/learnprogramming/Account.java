package academy.learnprogramming;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //Creating a constructor
    public Account() {

        //Use this if the constructor is enpty
        // this(1234, 2.50, "Default name", " Default address", "Default phone");
        //System.out.println("Empty constrcutor is called");
    }
    //Creating a constructor
    public Account(int number, double balance, String customerName, String email, int phoneNumber) {

        //create a reference by using "this."
        System.out.println("Account constructors with parameters are called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Another constructor
    public Account(String customerName, String email, int phoneNumber) {
        this(999, 100.55, customerName, email, phoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + "available. Withdraw not processed ");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal " + withdrawalAmount + "processed/ Remaining balance " + balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
