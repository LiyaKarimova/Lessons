package Lesson2;

import sun.lwawt.macosx.CSystemTray;

public class SecondClass {

    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] array = {1, 1, 0 , 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array [i] =0;
            } else { array [i]=1;
            }
            System.out.println(array[i]);
        }

        System.out.println("Задание 2");
        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int [] arr2 = new int [8];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = k;
            k+= 3;
            System.out.println(arr2[i]);
        }

        System.out.println("Задание 3");
       // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6){
                arr3[i] = arr3[i]*2;
            }
            System.out.println(arr3 [i]);
        }

        System.out.println("Задание 4");

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int [] [] arr4 = new int[5][5];
        for (int i = 0; i<5; i++){
            for (int j =0; j<5; j++){
               if ((i==j) || (i+j==arr4.length-1)){
                  arr4[i][j] =1;
               }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int [] arr5 = {1,2,3,10,45,15,21,-3,0};
        int kmin = arr5 [1];
        int kmax = arr5[1];
        for (int i = 0; i < arr5.length;i++){
            if (arr5[i]<kmin){
                kmin = arr5[i];
            }
            if (arr5[i] > kmax) {
                kmax = arr5[i];
            }
        }
        System.out.println("Минимальное: "+ kmin);
        System.out.println("Максимальное: "+ kmax);

        int [] arrBalance  = {2};
        System.out.println (checkBalance (arrBalance));
        int [] forShiftArray = {1,2,3,4,5};
        int [] arrB = shiftArray((forShiftArray),-2);
        for (int i=0;i < arrB.length; i++ ){
            System.out.print (+ arrB[i] + " ");
        }


    }
    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance (int arr[]){

        boolean key = false;
            int left = 0;
            for (int i = 0;i < arr.length; i++){
                left+=arr[i];
                int right = 0;
                for (int j = i+1; j < arr.length;j++) {
                    right += arr [j];
                }
                key = (right==left);
                System.out.println (left + " " + right);
                if (key){
                    break;
            }


        }

        return key;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.


    public static int[] shiftArray (int arr[],int a) {
        //int counter = 0;
        if (a > 0){
            for (int i = 0; i < a; i++) {
                int b = arr [0];
                for (int j= arr.length-1; j>-1; j--)
                     arr [(j+1)%arr.length] = arr[j];
                arr [1] = b;
                }

    }
        else
            for (int i = 0; i < -a; i++) {
                int b = arr [arr.length-1];
                for (int j= arr.length-1; j>-1; j--)
                    arr [(j-1)%arr.length] = arr[j];
                arr [arr.length-2] =b;

            }
        return arr;
    }
}
