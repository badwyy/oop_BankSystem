package bank;

public class PersonalInfo {

    private String Fristname;
    private String Middelname;
    private String Lastname;
    private String adress;
    private String Email;
    private String DateOfBirth;
    private String PhoneNum;
// An empty constructor to initialize all the modifiers by 0 or null or false. Or to use the Set method and set values of the modifiers .  

    public PersonalInfo() {
    }
// A parameterized constructor to give values to all the modifiers (String , int , boolean,....)

    public PersonalInfo(String Fristname, String Middelname, String Lastname, String adress, String Email, String DateOfBirth, String PhoneNum) {
        this.Fristname = Fristname;
        this.Middelname = Middelname;
        this.Lastname = Lastname;
        this.adress = adress;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
        this.PhoneNum = PhoneNum;
    }
// Setters and Getters to set value fo a certain modifier or to get value fo a certain modifier

    public String getFristname() {
        return Fristname;
    }

    public void setFristname(String Fristname) {
        this.Fristname = Fristname;
    }

    public String getMiddelname() {
        return Middelname;
    }

    public void setMiddelname(String Middelname) {
        this.Middelname = Middelname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }
// toString to print the values of all the modifier

    @Override
    public String toString() {
        return "PersonalInfo{" + "Fristname=" + Fristname + ", Middelname=" + Middelname + ", Lastname=" + Lastname + ", adress=" + adress + ", Email=" + Email + ", DateOfBirth=" + DateOfBirth + ", PhoneNum=" + PhoneNum + '}';
    }
}
