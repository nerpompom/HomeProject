package com.homeproject.lesson_1;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee (String name, String surname, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String info () {
        return " Name: " + name + " Surname: " + surname + " Position: " + position + " Email: " + email + " Phone: " + phone + " Salary: " + salary + "р" + " Age: " + age;
    }
    public int getAge() {
        return age;
    }
}
