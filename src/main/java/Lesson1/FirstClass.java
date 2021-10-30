package Lesson1;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        float b = 1F;
        float a = -3F;
        float c = 1F;
        float d = 1F;
        boolean key = true;
        /*short a = 250;
        int val = 1000;
        long c = 10000L;
        float f = 2.25F;
        double m = 3.34587;
        char nameOne = 'H';
        char nameTwo = '\123';
        boolean name = false; */
        System.out.println(numberThree(a,b,c,d));
        System.out.println(numberFour(5,5));
        numberFive(-10);
        System.out.println(numberSix(10));
        numberSeven("Никита");
        whatAge (2400);

    }

    public static float numberThree (float a, float b, float c, float d) {
        return a * (b + (c / d));

    }
//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean numberFour (int e, int f) {
        boolean key;
        return  (e+f<=20 && e+f>=10);
        //    key = true;
      //  } else {
      //      key = false;
      //  }

      //  return key;
    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void numberFive (int g){
        if (g>=0)
            System.out.println("Число положительное");
        else System.out.println("Число отрицательное");

    }

    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean numberSix (int a){
       // boolean key;
       // if (a < 0)
       //         key = true;
       // else key = false;
        return a <  0;
    }

   // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void numberSeven (String str){
        System.out.println("Привет, "+ str +"!");
    }

   // * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void whatAge (int age){
        boolean key;
        key = ((age % 4 == 0) && !(age % 100 == 0)) || (age % 400 == 0);
        if (key)
            System.out.println ("Год високосный");
       else System.out.println("Год НЕвисокосный");

    }


}

