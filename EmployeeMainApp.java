package com.homeproject.lesson_1;

public class EmployeeMainApp {
    public static void main (String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Андрей", "Андреев", "строитель", "a.a@gmail.com", "+7 (995) 347 46 50", 100000, 34);
        employeeArray[1] = new Employee("Сергей", "Петров", "архитектор", "s.p@gmail.com", "+7 (996) 343 40 52", 90000, 44);
        employeeArray[2] = new Employee("Владимир", "Сидоров", "инженер", "v.s@gmail.com", "+7 (997) 349 55 58", 70000, 40);
        employeeArray[3] = new Employee("Николай", "Васильев", "программист", "n.v@gmail.com", "+7 (994) 340 65 59", 90000, 31);
        employeeArray[4] = new Employee("Ольга", "Журавлёва", "инженер", "o.j@gmail.com", "+7 (993) 341 15 56", 70000, 49);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i].info());
            }
        }
    }
}
