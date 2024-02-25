package bank;

import java.util.Date;
import java.util.Scanner;

public class Account {

    protected int AccNum;
    protected int password;
    protected double balance;
    protected Date dateCreated;
// An empty constructor to initialize all the modifiers by 0 or null or false. Or to use the Set method and set values of the modifiers .  

    public Account() {
    }
// A parameterized constructor to give values to all the modifiers (String , int , boolean,....)

    public Account(int AccNum, int password, double balance, Date dateCreated) {
        this.AccNum = AccNum;
        this.password = password;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }
// Setters and Getters to set value fo a certain modifier or to get value from a certain modifier

    public int getAccNum() {
        return AccNum;
    }

    public void setAccNum(int AccNum) {
        this.AccNum = AccNum;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
//Method for the customer to be able to withdraw money from the balance
    public void Withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("No enough Balance");
        } else {
            this.balance = this.balance - amount;
        }
    }
//method for customer to be able to deposit money into the account
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }
//metod to display the current balance in the account
    public void CheckAmount() {
        System.out.println("The Balance in your account is : " + balance);
    }
//addpassword and changepassword methods to add or edit account password
    public int addpassword() {
        Scanner input = new Scanner(System.in);
        Account CusAcc = new Account();
        System.out.println("enter your password");
        this.password = input.nextInt();
        setPassword(password);
        CusAcc.setPassword(password);
        return password;
    }

    public void changepassword() {
        Account CusAcc = new Account();
        Scanner input = new Scanner(System.in);
        System.out.println("are you sure you want to change password");
        String answer = input.next();
        if (answer.equals("yes")) {
            System.out.println("enter your new password");
            int newpass = input.nextInt();
            this.password = newpass;
        }
    }
// toString to print the values of all the modifier

    @Override
    public String toString() {
        return "Account{" + "AccNum=" + AccNum + ", password=" + password + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }
}
