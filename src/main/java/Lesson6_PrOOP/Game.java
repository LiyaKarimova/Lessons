package Lesson6_PrOOP;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

//класс визуализации в консоль
public class Game {
    public static int action;
    ArrayList <Cat> arrayCat = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Plate plate = new Plate(0);
    boolean game = true;

//    public Game () {
//
//    }

    public void buttons () {
        System.out.println("0 - Вывести кнопки");
        System.out.println("1 - Создать котика");
        System.out.println("2 - Добавить еду в тарелку");
        System.out.println("3 - Узнать, сколько еды в тарелке");
        System.out.println("4 - Покормить котика");
        System.out.println("5 - Покормить всех котиков");
        System.out.println("6 - Вывести информацию о всех котиках");
    }

    public void newCat () {
        System.out.println("Введите имя котика");
        String name = sc.next();
        System.out.println("Введите аппетит котика");
        int appetit = sc.nextInt();
        Cat cat1 = new Cat (name, appetit);
        arrayCat.add(cat1);
        System.out.println("Создан котик " + name + " под номером " + cat1.getCounterCat() + " с аппетитом " + appetit);

    }

    public void addFood () {
        System.out.println("Сколько еды добавить?");
        int food = sc.nextInt();
        plate.addFood(food);
        plate.info();
    }

    public void eatForCat (){
        System.out.println("Котика под каким номером вы хотите покормить?");
        int i = sc.nextInt();
        System.out.print(arrayCat.get(i-1).name + ":");
        arrayCat.get(i-1).eat(plate);

    }

    public void eatForAllCat () {
        for (int i =0; i<arrayCat.size(); i++) {
            System.out.print(arrayCat.get(i).name + ": ");
            arrayCat.get(i).eat(plate);
        }
        //System.out.println("Действие сделано");
    }

    public void catInfo () {
        for (int j =0; j <arrayCat.size(); j++) {
            System.out.print((j+1) + "." + arrayCat.get(j).name + " аппетит: "+ arrayCat.get(j).appetite + " ");
            arrayCat.get(j).isFullness();
        }
    }

    public void startGame () {
        buttons();
        while (true) {
            action = sc.nextInt();
            switch (action) {
                case (0):
                    buttons();
                    break;
                case (1):
                    newCat();
                    break;
                case (2):
                    addFood();
                    break;
                case (3):
                    plate.info();
                    break;
                case (4):
                    eatForCat();
                    break;
                case (5):
                    eatForAllCat();
                    break;
                case (6):
                    catInfo();
                    break;


            }
        }

    }
}


