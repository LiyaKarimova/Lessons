package Lesson6_PrOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

    public static void main(String[] args) {
        Dog dogBobic = new Dog ("Бобик",400);
        Dog dogLinda = new Dog ("Linda", 200);
        System.out.println(Dog.counterDog);
        Animal dog1 = new Dog ("Dad", 20);
        System.out.println(Dog.counterDog);
        System.out.println(Animal.counterAnimal);
        System.out.println();
        Cat catMyrzic = new Cat ("Мурзик", 200);
        System.out.println(Animal.counterAnimal);
        System.out.println(Cat.counterCat);

    }


}
