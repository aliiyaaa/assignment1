import models.Student;
import models.Teacher;
import models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/students.txt");
        File file2 = new File("src/teachers.txt");
        Scanner sc1 = new Scanner(file);
        Scanner sc2 = new Scanner(file2);

        School school = new School();
        while (sc1.hasNext()) {
            String line = sc1.nextLine();

            if(line.trim().isEmpty()) {
                continue;
            }

            String[] array = line.split(" ");

            if (array.length < 4) {
                System.out.println("more info for student: " + line);
                continue;
            }

            String name = array[0];
            String surname = array[1];
            int age = Integer.parseInt(array[2]);
            boolean gender = array[3].equalsIgnoreCase("Male");

            ArrayList<Integer> grades = new ArrayList<>();
            Student student = new Student(name, surname, age, gender, grades);

            for (int i = 4; i < array.length; i++) {
                student.addGrade(Integer.parseInt(array[i]));
            }

            school.addMember(student);
        }


        while (sc2.hasNext()) {
            String line2 = sc2.nextLine();
            if (line2.trim().isEmpty()) {
                continue;
            }
            String[] array2 = line2.split(" ");

            if (array2.length < 7) {
                System.out.println("more info for teacher");
                continue;
            }
            String name = array2[0];
            String surname = array2[1];
            int age = Integer.parseInt(array2[2]);
            boolean gender = array2[3].equalsIgnoreCase("Male");
            String subject = array2[4];
            int yearsOfExperience = Integer.parseInt(array2[5]);
            int salary = Integer.parseInt(array2[6]);

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
            school.addMember(teacher);


            teacher.giveRaise(10);
        }

        sc1.close();
        sc2.close();
        System.out.println(school)  ;
    }
}