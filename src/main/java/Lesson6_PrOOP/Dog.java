package Lesson6_PrOOP;

import javax.swing.*;

 public class Dog extends Animal {
     public static int counterDog;

    public Dog (String name,int l) {
        super(name,l);
        counterDog++;
    }

    @Override
    public void run () {
        if (length > DOG_RUN_MAX) {
            System.out.println("Собака не может бежать так много");
        } else {
            super.run();
        }

    }

    @Override
    public void swim (){
        if (length > DOG_SWIM_MAX) {
            System.out.println("Собака не может так много плыть");
        } else {
            super.swim();
        }
    }

    public void gav () {
        System.out.println("Гав гав");
    }

//    public int getCounterDog () {
//        return counterDog;
//    }

}
