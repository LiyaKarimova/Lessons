package Lesson3;

import java.util.Random;
import java.util.Scanner;

// 2. * Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
// сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.


public class ThreePartTwo {
    public static void main(String[] args) {
        scWord();

    }

    public static void scWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int i = rand.nextInt(24);
        String programWord = words[i];
        System.out.println(programWord); //выбрали рандомное слово из массива
        System.out.println("Попробуй отгадать слово");
        Scanner sc = new Scanner(System.in);
        String userWord = sc.nextLine();
        //  sc.close();
        //compareWords(userWord, programWord);
        while (!compareWords(userWord, programWord)) {
            System.out.println("Попробуй еще раз");
            sc = new Scanner(System.in);
            userWord = sc.nextLine();

            //compareWords(userWord, programWord);
        }

        System.out.println("Победа!!!");


//            sc = new Scanner(System.in);
//            userWord = sc.nextLine();
//            compareWords(userWord, programWord);
    }


//            System.out.println("Попробуй еще раз!");
//            compareWords(userWord, programWord);
//
//        }
//        else {
//            System.out.println("Победа!");
//            return;
//
//        }//вызываем сравнение

    //  }

    //сравниваем буквы слов и выводим на экран

    public static boolean compareWords(String userWord, String programWord) {
        for (int k = 0; k < programWord.length(); k++) {
            char b = programWord.charAt(k);
            if (userWord.length()-1 < k){
                break;
            }
            char a = userWord.charAt(k);
            if (a == b) {
                System.out.print(a);
            } else {
                System.out.print("#");
            }
        }

        for (int i = 0; i < 15 - userWord.length(); i++) {
            System.out.print("#");
        }
        System.out.println();
        return (userWord.equals(programWord));


//повторяем пока пользователь не угадал
        // public static void Repeat (){

        // }


    }
}

