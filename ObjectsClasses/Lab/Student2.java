package Fundamentals.ObjectsClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student2 {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student2(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Student2> studentsList = new ArrayList<>();
        String input;

        while (!"end".equals(input = console.nextLine())) {
            String[] attributeStudent = input.split(" ");

            String firstName = attributeStudent[0];
            String lastName = attributeStudent[1];
            int age = Integer.parseInt(attributeStudent[2]);
            String city = attributeStudent[3];

            Student2 studentSingle = studentsList.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)).findFirst().orElse(null);
            if (studentSingle == null) {
                Student2 studentToAdd = new Student2(firstName, lastName, age, city);
                studentsList.add(studentToAdd);
            } else {
                studentSingle.setAge(age);
                studentSingle.setCity(city);
            }
        }

        String filterCity = console.nextLine();
        for (Student2 student : studentsList) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}