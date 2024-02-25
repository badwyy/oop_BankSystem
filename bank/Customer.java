                    package bank;

import java.util.*;

public class Customer {

    private String CusID;
    private PersonalInfo personalInfo; //Compostion from class personalInfo for reusability and not to repeat the modifiers in all classes .
    private Account account; //Association relation between this class and Account class to make the customer have an account in the Bank.
    private DebitAcc debitAcc; //Association relation between this class and DebitAcc class to make the customer have a debitAcc in the Bank.
    
    // An empty constructor to initialize all the modifiers by 0 or null or false. Or to use the Set method and set values of the modifiers .  
    public Customer() {
    }
    
    // A parameterized constructor to give values to all the modifiers (String , int , boolean,....)
    public Customer(String CusID, String Fristname, String Middelname, String Lastname, String adress, String Email, String DateOfBirth, String PhoneNum, Account account) {
        this.CusID = CusID;
        this.personalInfo = new PersonalInfo(Fristname, Middelname, Lastname, adress, Email, DateOfBirth, PhoneNum);
        this.account = account;
    }
    
    // A parameterized constructor to give values to all the modifiers (String , int , boolean,....)
    public Customer(String CusID, String Fristname, String Middelname, String Lastname, String adress, String Email, String DateOfBirth, String PhoneNum, DebitAcc debitAcc) {
        this.CusID = CusID;
        this.personalInfo = new PersonalInfo(Fristname, Middelname, Lastname, adress, Email, DateOfBirth, PhoneNum);
        this.debitAcc = debitAcc;
    }
    
    // Setters and Getters to set value fo a certain modifier or to get value from a certain modifier
    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }
    
    //method enables the user to choose to withdraw,deposit or display debitaccount
    public void OptionsDebit() {
        int a = this.debitAcc.getPassword();
        int x = 0;
        System.out.println("Please enter your password");
        Scanner input = new Scanner(System.in);
        int pass = input.nextInt();
        if (pass == a) {
            while (x != 100) {
                if (x == 0) {
                    System.out.println("Please choose your service from 1 for (withdraw) or 2 for (deposit) or 3 for (checkAmount)");
                    x = input.nextInt();
                }
                if (x == 1) {
                    System.out.println("You choose withdraw please enter the amount you need to withdraw it");
                    double y = input.nextDouble();
                    this.debitAcc.Withdraw(y);
                    System.out.println("press 1 to continue or press any number to exit");
                    int z = input.nextInt();
                    if (z == 1) {
                        x = 0;
                    } else {
                        x = 100;
                    }
                } else if (x == 2) {
                    System.out.println("You choose deposit please enter the amount you need to deposit it");
                    double y = input.nextDouble();
                    this.debitAcc.Deposit(y);
                    System.out.println("press 1 to continue or press any number to exit");
                    int z = input.nextInt();
                    if (z == 1) {
                        x = 0;
                    } else {
                        x = 100;
                    }
                } else if (x == 3) {
                    System.out.println("You choose checkAmount");
                    this.debitAcc.CheckAmount();
                    x = 100;
                } else if (x < 1 || x > 3) {
                    System.out.println("Try again");
                    x = 0;
                    break;
                }
            }
        } else {
            System.out.println("Invalid Password");
        }
    }
    
    //method enables the user to choose to withdraw,deposit or display account
    public void OptionsAcc() {
        int t = this.account.getPassword();
        int x = 0;
        System.out.println("Please enter your password");
        Scanner input = new Scanner(System.in);
        int pass = input.nextInt();
        if (pass == t) {
            while (x != 100) {
                if (x == 0) {
                    System.out.println("Please choose your service from 1 for (withdraw) or 2 for (deposit) or 3 for (checkAmount)");
                    x = input.nextInt();
                }
                if (x == 1) {
                    System.out.println("You choose withdraw please enter the amount you need to withdraw it");
                    double y = input.nextDouble();
                    this.account.Withdraw(y);
                    System.out.println("press 1 to continue or press any number to exit");
                    int z = input.nextInt();
                    if (z == 1) {
                        x = 0;
                    } else {
                        x = 100;
                    }
                } else if (x == 2) {
                    System.out.println("You choose deposit please enter the amount you need to deposit it");
                    double y = input.nextDouble();
                    this.account.Deposit(y);
                    System.out.println("press 1 to continue or press any number to exit");
                    int z = input.nextInt();
                    if (z == 1) {
                        x = 0;
                    } else {
                        x = 100;
                    }
                } else if (x == 3) {
                    System.out.println("You choose checkAmount");
                    this.account.CheckAmount();
                    x = 100;
                } else if (x < 1 || x > 3) {
                    System.out.println("Try again");
                    x = 0;
                    break;
                }
            }
        }
    }
    
    // toString to print the values of all the modifier
    public String toStringDebit() {
        return "Customer{" + "CusID=" + CusID + ", PersonalInfo=" + personalInfo + ", Account=" + debitAcc + '}';
    }

    public String toStringAcc() {
        return "Customer{" + "CusID=" + CusID + ", PersonalInfo=" + personalInfo + ", Account=" + account + '}';
    }

}
