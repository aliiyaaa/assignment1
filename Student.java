package models;

import java.util.ArrayList;

public class Student extends Person {
    public static int idCounter = 1;
    private int studentID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Grade can only be 0 and 100");
        }
    }

    public double calculateGPA() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += (grades.get(i) / 100.0) * 4.0;
        }
        return Math.round(sum / grades.size());
    }
    @Override
    public String toString() {
        return super.toString() + " I'm a student with ID " + studentID + ",gpa " + calculateGPA();
    }
}