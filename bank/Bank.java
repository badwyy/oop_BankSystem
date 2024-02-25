package bank;

import java.util.Date;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args)
           {
        Scanner S = new Scanner(System.in);
        Date date = new Date();
        int x = 0, y = 0;
        int choice = 0;
        while (choice < 4) {
            System.out.println(">>>>>>> MENU <<<<<<<<");
            System.out.println("1. Add new Employee .");
            System.out.println("2. Employee : Add new Customer with new Account.");
            System.out.println("3. Employee : Add new Customer with new Debit Account .");
            System.out.println("4. Exit");
            choice = S.nextInt();
            if (choice == 1) {
                String a[] = new String[8];
                System.out.println("Please enter all the info in order of \"EmpID\" ,\"Fristname\", \"Middelname\", \"Lastname\", \"adress\", \"Email\", \"DateOfBirth\", \"PhoneNum\", \"Salary\" ,\"Bonus\"");
                for (int i = 0; i < a.length; i++) {
                    a[i] = S.next();
                }
                Employee e1 = new Employee(a[0], x, y, a[1], a[2], a[3], a[4], a[5], a[6], a[7]);
                e1.setSalary(x = S.nextInt());
                e1.setBonus(y = S.nextInt());
                System.out.println(e1.toString());
            } else if (choice == 2) {
                Account a1 = new Account();
                String a[] = new String[8];
                System.out.println("Please enter all the info in order of \"CusID\",\"Fristname\", \"Middelname\", \"Lastname\", \"adress\", \"Email\", \"DateOfBirth\", \"PhoneNum\" , \"AccNum\" , \"password\" , \"balance\" ");
                for (int i = 0; i < a.length; i++) {
                    a[i] = S.next();
                }
                a1.setAccNum(x = S.nextInt());
                a1.setPassword(x = S.nextInt());
                a1.setBalance(x = S.nextInt());
                a1.setDateCreated(date);
                Customer c1 = new Customer(a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a1);
                System.out.println("Are you the Customer?\nAnswer with true of false");
                boolean t = S.nextBoolean();
                if (t == true) {
                    System.out.print("Do you want to change your password?\nAnswer with true or false : ");
                    boolean w = S.nextBoolean();
                    if (w == true) {
                        System.out.print("are you sure you want to change password\nAnswer with yes or no : ");
                        String answer = S.next();
                        if (answer.equals("yes")) {
                            System.out.println("enter your new password");
                            int newpass = S.nextInt();
                            a1.setPassword(newpass);
                        }
                    }
                    c1.OptionsAcc();
                    System.out.println(c1.toStringAcc());
                } else {
                    System.out.println(c1.toStringAcc());
                }
            } else if (choice == 3) {
                DebitAcc a1 = new DebitAcc();
                String a[] = new String[8];
                System.out.println("Please enter all the info in order of \"CusID\",\"Fristname\", \"Middelname\", \"Lastname\", \"adress\", \"Email\", \"DateOfBirth\", \"PhoneNum\" , \"AccNum\" , \"password\" , \"balance\" ");
                for (int i = 0; i < a.length; i++) {
                    a[i] = S.next();
                }
                a1.setAccNum(x = S.nextInt());
                a1.setPassword(x = S.nextInt());
                a1.setBalance(x = S.nextInt());
                a1.setDateCreated(date);
                a1.getAnnulinterestrate();
                a1.getMonthlyinterestrate();
                Customer c1 = new Customer(a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a1);
                System.out.println("Are you the Customer?\nAnswer with true of flase");
                boolean t = S.nextBoolean();
                if (t == true) {
                    System.out.println("Do you want to change your password?\nAnswer with true or flase");
                    boolean w = S.nextBoolean();
                    if (w == true) {
                        System.out.println("are you sure you want to change password\nAnswer with yes or no");
                        String answer = S.next();
                        if (answer.equals("yes")) {
                            System.out.println("enter your new password");
                            int newpass = S.nextInt();
                            a1.setPassword(newpass);
                        }
                    }
                    c1.OptionsDebit();
                    System.out.println(c1.toStringDebit());
                } else {
                    System.out.println(c1.toStringDebit());
                }
            } else {
                System.out.println("Ended");
            }
        }
    }
}
