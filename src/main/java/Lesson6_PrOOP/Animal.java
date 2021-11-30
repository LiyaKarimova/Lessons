package Lesson6_PrOOP;

public class Animal {
    static final int CAT_RUN_MAX = 200;
    static final int DOG_RUN_MAX = 500;
    //static final int CAT_SWIM_MAX = 0;
    static final int DOG_SWIM_MAX = 10;
    public String name;
    //public int length;
    static int counterAnimal;


    public Animal (String name) {
        this.name = name;
        counterAnimal++;
    }

    public void run (int l) {
        System.out.println( name + " бежит " + l + " м.");
    }

    public void swim (int l) {
        System.out.println(name + " плывет " + l + " м.");
    }

    public int getCounterAnimal () {
        return counterAnimal;
    }

    public void howMuch () {
        System.out.println(counterAnimal);
    }
}
