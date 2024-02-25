package bank;

public class Employee {

    private String EmpID;
    private double Salary;
    private int Bonus;
    private PersonalInfo personalInfo; //Compostion from class personalInfo for reusability and not to repeat the modifiers in all classes .
    // An empty constructor to initialize all the modifiers by 0 or null or false. Or to use the Set method and set values of the modifiers .  

    public Employee() {
    }
    // A parameterized constructor to give values to all the modifiers (String , int , boolean,....)

    public Employee(String EmpID, double Salary, int Bonus, String Fristname, String Middelname, String Lastname, String adress, String Email, String DateOfBirth, String PhoneNum) {
        this.EmpID = EmpID;
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.personalInfo = new PersonalInfo(Fristname, Middelname, Lastname, adress, Email, DateOfBirth, PhoneNum);
    }
    // A parameterized constructor to give values to all the modifiers (String , int , boolean,....)

    public Employee(String EmpID, double Salary, int Bonus, PersonalInfo personalInfo) {
        this.EmpID = EmpID;
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.personalInfo = personalInfo;
    }
    // Setters and Getters to set value fo a certain modifier or to get value fo a certain modifier

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    // toString to print the values of all the modifier
    @Override
    public String toString() {
        return "Employee{" + "EmpID=" + EmpID + ", Salary=" + Salary + ", Bonus=" + Bonus + ", personalInfo=" + personalInfo + '}';
    }

}
