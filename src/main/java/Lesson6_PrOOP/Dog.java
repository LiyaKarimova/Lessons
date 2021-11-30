package Lesson6_PrOOP;

import javax.swing.*;

 public class Dog extends Animal {
     public static int counterDog;

    public Dog (String name) {
        super(name);
        counterDog++;
    }

    @Override
    public void run (int l) {
        if (l > DOG_RUN_MAX) {
            System.out.println("Собака не может бежать так много");
        } else {
            super.run(l);
        }

    }

    @Override
    public void swim (int l){
        if (l > DOG_SWIM_MAX) {
            System.out.println("Собака не может так много плыть");
        } else {
            super.swim(l);
        }
    }

    public void gav () {
        System.out.println("Гав гав");
    }

//    public int getCounterDog () {
//        return counterDog;
//    }

}
