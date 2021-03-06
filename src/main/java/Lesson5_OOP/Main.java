package Lesson5_OOP;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class Main {

    public static void main(String[] args) {
        Employee [] empArray = new Employee [6];
        empArray [0] = new Employee("Иванов", "стажер","ivanov@mail.ru", "786", 20000, 20);
        empArray [1] = new Employee ("Каримова", "менеджер","klm@mail.ru", "123", 60000, 23);
        empArray [2] = new Employee("Петрова", "руководитель","ptr@mail.ru", "678", 70000, 40);
        empArray [3] = new Employee("Филимонова", "директор","vgh@mail.ru", "689", 80000, 45);
        empArray [4] = new Employee("Сидоров", "ректор","kfie@mail.ru", "345", 100000, 50);
    // вариант 1
        for (int i = 0; i < empArray.length; i++) {
            if (empArray [i].getAge() > 40) {
                empArray [i].info();
            }
        }

    // вариант 2  Если я напишу так, то он напечает ссылку на объекты, да?
//        for (int i = 0; i < empArray.length; i++) {
//            System.out.println(empArray [i]);
//        }

    }
    }



