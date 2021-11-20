package Lesson6_PrOOP;

public class Animal {
    static final int CAT_RUN_MAX = 200;
    static final int DOG_RUN_MAX = 500;
    //static final int CAT_SWIM_MAX = 0;
    static final int DOG_SWIM_MAX = 10;
    public String name;
    public int length;
    static int counterAnimal;


    public Animal (String name, int l) {
        this.name = name;
        this.length = l;
        counterAnimal++;
    }

    public void run () {
        System.out.println( name + " бежит " + length + " м.");
    }

    public void swim () {
        System.out.println(name + " плывет " + length + " м.");
    }

    public int getCounterAnimal () {
        return counterAnimal;
    }

    public void howMuch () {
        System.out.println(counterAnimal);
    }
}
