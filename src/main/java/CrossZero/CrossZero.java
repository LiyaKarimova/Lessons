package CrossZero;

import java.util.Random;
import java.util.Scanner;

public class CrossZero {
    public static int SIZE = 5;
    public static int SIZE_WIN = 4;
    public static char DOT_EMPTY = '*';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            System.out.println();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            System.out.println();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    //метод инициализирует массив
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //метод, печатающий поле
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //метод отвечающий за ход игрока

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    //метод отвечающий за ход компьютера
    public static void aiTurn() {
        int x;
        int y;

        //блокировка диагонали
        int countD = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == DOT_X) {
                countD++;
                if ( countD == (SIZE_WIN - 1) ){
                    if ( (isCellValid (i + 1, i + 1) ) ) {
                        map [i + 1][i + 1] = DOT_O;
                        return;
                    }
                    if ( (isCellValid (i - SIZE_WIN + 1, i - SIZE_WIN + 1)) ) {
                        map [i - SIZE_WIN + 1][i - SIZE_WIN + 1] = DOT_O;
                        return;
                    }
                }
            } else {
                countD = 0;
            }
        }
        System.out.println("Не заблокировали диагональ");

        //блокировка побочной диагонали

        int countDD = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] == DOT_X) {
                countDD++;
                if (countDD == SIZE_WIN - 1) {
                    if (isCellValid (i + 1, SIZE - i - 2)) {
                        map [i + 1][SIZE - i - 2] = DOT_O;
                        return;
                    }
                    if ( isCellValid (i - SIZE_WIN + 1, SIZE - 2 - i + SIZE_WIN ) ) {
                        map [i - SIZE_WIN + 1][SIZE - 2 - i + SIZE_WIN ] = DOT_O;
                        return;
                    }
                }
            } else {
                countDD = 0;
            }
        }

        //блокировка строк
        int countL = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == DOT_X) {
                    countL++;
                    if(countL == SIZE_WIN - 1){
                        if ( isCellValid (i,j + 1)){
                            map[i][j + 1] = DOT_O;
                            return;
                        }
                        if ( (countL == SIZE_WIN - 1) && (isCellValid (i,j - SIZE_WIN + 1))) {
                            map[i][j - SIZE_WIN + 1] = DOT_O;
                            return;
                        }
                    }
                } else {
                    countL = 0;
                }
            }
        }

        System.out.println("Не заблокировали строку");

        // блокировка столбцов
        int countС = 0;
        for (int j = 0; j < SIZE; j++) {
            System.out.println("Новый столбец");
            for (int i = 0; i < SIZE; i++) {
                if (map [i][j] == DOT_X) {
                    countС++;
                    System.out.println("Нашел Х");
                    if(countС == SIZE_WIN - 1){
                        if ( (isCellValid (i + 1, j )) ){
                            map[i + 1][j] = DOT_O;
                            return;
                        }
                        if ( (countС == SIZE_WIN - 1) && (isCellValid (i - SIZE_WIN + 1, j ))) {
                            map[i - SIZE_WIN + 1][j] = DOT_O;
                            return;
                        }
                    }

                } else {
                    countС = 0;
                }
            }
        }
        System.out.println("Не заблокировали столбец");



        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        map[y][x] = DOT_O;
    }




    //метод-проверка победы

    public static boolean checkWin (char symbol) {

        int countD = 0;
        int countDD = 0;
        for (int i = 0; i < SIZE; i++) {
            if ((map[i][i] == symbol)) {
                countD++;
                if (countD == SIZE_WIN) {
                    return true;
                }
            } else {
                countD = 0;
            }
            if (map[i][SIZE - 1 - i] == symbol) {
                countDD++;
                if (countDD == SIZE_WIN) {
                    return true;
                }
            } else {
                countDD = 0;
            }
        }




//        int countDD = 0;
//        for (int i = 0;i < SIZE; i++) {
//                if (map [i][SIZE - 1 - i] == symbol) {
//                    countDD++;
//                }
//                else {
//                    countDD = 0;
//                }
//                if (countDD == SIZE_WIN) {
//                    return true;
//                }
//
//        }

        int countL = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    countL++;
                    if (countL == SIZE_WIN ) {
                        return true;
                    }
                } else {
                    countL = 0;
                }
            }
            countL = 0;
        }




    int countC = 0;
        for (int j = 0; j < SIZE; j++) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][j] == symbol) {
                countC++;
                if (countC == SIZE_WIN ) {
                    return true;
                }
            } else {
                countC = 0;
            }
        }
        countC = 0;
    }

        return false;
    }





    //метод-поиск пустого поля
    public static boolean isCellValid (int x, int y){
        if ( x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return (map [x][y] == DOT_EMPTY);
    }

    //метод проверка переполнения поля
    public static boolean isMapFull (){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


}
