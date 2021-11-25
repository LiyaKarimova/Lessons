package Lesson6_PrOOP;

public class Cat extends Animal {
    static int counterCat;
    private int appetite;
    private boolean fullness;


    public Cat (String name, int appetite){
        super (name);
        this.appetite = appetite;
        this.fullness = false;
        counterCat++;
    }

    @Override
    public void run (int l) {
        if (l > CAT_RUN_MAX) {
            System.out.println("Кошка не умеет столько бежать");
        } else {
            super.run(l);
        }
    }

    @Override
    public void swim (int l) {
        System.out.println("Коты не умеют плавать");
    }

    public int  getCounterCat () {
        return counterCat;
    }

    public void eat (Plate p) {
        if (p.decreaseFood(appetite)) {
            fullness = true;
        }
    }

    public void isFullness (){
        if (fullness) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }

    }

}
