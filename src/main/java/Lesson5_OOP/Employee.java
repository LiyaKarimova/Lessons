package Lesson5_OOP;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee () {
        this.name = "No";
        this.position = "No";
        this.email = "No";
        this. phone = "No";
        this.salary = 0;
        this.age = 0;
    }

    public Employee (String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this. phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge () {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + name + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + "; Должность: " + salary + "; Возраст: " + age);
    }
}
