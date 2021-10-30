package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Task();


    }

    public static void Task(){
        System.out.println("Я загадала число от 0 до 9, попробуй отгадать! Введи число.");
        Random rand = new Random ();
        int programNumber = rand.nextInt (10);
        System.out.println(programNumber);
        Scanner sc = new Scanner (System.in);
        for (int i =0; i<3; i++){
            int number = sc.nextInt();
            // whatNumber (number, programNumber);
            if (whatNumber(number, programNumber)){
                break;
            }
        }

    }



    //public static boolean

    //1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

public static boolean whatNumber (int number, int programNumber){
//        Random rand = new Random ();
//        int programNumber = rand.nextInt (10);
//        for (int i = 0; i < 3; i++){
//        Scanner sc = new Scanner (System.in);
//        number = sc.nextInt();
         if (number>programNumber) {
             System.out.println("Твое число больше");
         }
         if (number == programNumber){
             System.out.println("Победа!!!");
             return true;
         }
            if (number<programNumber) {
                System.out.println("Твое число меньше");
            }
    return false;
}

}


