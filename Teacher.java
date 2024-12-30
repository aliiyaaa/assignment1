package models;

public class Teacher extends Person {
    public int salary;
    public String subject;
    public int yearsOfExpirience;



    public Teacher() {
    }

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExpirience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExpirience = yearsOfExpirience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " I teach " + subject + " , My salary: " + salary + ".";
    }
}