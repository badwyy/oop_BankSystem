package bank;

import java.util.Date;
import java.util.Scanner;
//DebitAcc class is inherited from class Account for the reusability
public class DebitAcc extends Account {

    protected double annualInterestRate = 0.18;

    // An empty constructor to initialize all the modifiers by 0 or null or false. Or to use the Set method and set values of the modifiers .  
    public DebitAcc() {
    }

    // A parameterized constructor to give values to all the modifiers (String , int , boolean,....)
    public DebitAcc(double annualInterestRate, int AccNum, int password, double balance, Date dateCreated) {
        super(AccNum, password, balance, dateCreated);
        this.annualInterestRate = annualInterestRate;
    }

    // Setters and Getters to set value fo a certain modifier or to get value from a certain modifier and they are all overrided from the Setters and Getters in Account class
    public double getMonthlyinterestrate() {
        return this.balance * 0.083 * 0.18;
    }

    public double getAnnulinterestrate() {
        return (this.balance * annualInterestRate);
    }

    @Override
    public int getAccNum() {
        return AccNum;
    }

    @Override
    public void setAccNum(int AccNum) {
        this.AccNum = AccNum;
    }

    @Override
    public int getPassword() {
        return password;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //method for customer to be able to withdraw money from the balance in debit account and it is overrided from the Withdraw metod in Account class
    @Override
    public void Withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("No enough Balance");
        } else {
            this.balance = this.balance - amount;
        }
    }

    //method for customer to be able to deposit money into the debit account and it is overrided from the Deposit metod in Account class
    @Override
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }

    //metod to display the current balance in the debit account and it is overrided from the CheckAmount metod in Account class
    @Override
    public void CheckAmount() {
        System.out.println("The final Balance with Monthly interest rate is : " + this.balance * 0.083 * 0.18);
    }

    //addpassword and changepassword methods to add or edit debit account password they are all overrided from the addpassword and changepassword in Account class
    @Override
    public int addpassword() {
        Scanner input = new Scanner(System.in);
        Account CusAcc = new Account();
        System.out.println("enter your password");
        int c = input.nextInt();
        CusAcc.setPassword(c);
        return c;
    }

    @Override
    public void changepassword() {
        Account CusAcc = new Account();
        Scanner input = new Scanner(System.in);
        System.out.println("are you sure you want to change password");
        String answer = input.next();
        if (answer.equals("yes")) {
            System.out.println("enter your new password");
            int newpass = input.nextInt();
            CusAcc.password = newpass;
        }
    }
    // toString to print the values of all the modifier

    @Override
    public String toString() {
        return "DebitAcc{" + "annualInterestRate=" + annualInterestRate + ", AccNum=" + AccNum + ", password=" + password + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }

}
