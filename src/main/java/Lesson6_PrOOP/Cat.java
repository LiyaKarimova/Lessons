package Lesson6_PrOOP;

public class Cat extends Animal {
    static int counterCat;


    public Cat (String name, int l){
        super (name, l);
        counterCat++;

    }

    @Override
    public void run () {
        if (length > CAT_RUN_MAX) {
            System.out.println("Кошка не умеет столько бежать");
        } else {
            super.run();
        }
    }

    @Override
    public void swim () {
        System.out.println("Коты не умеют плавать");
    }

    public int  getCounterCat () {
        return counterCat;
    }

}
