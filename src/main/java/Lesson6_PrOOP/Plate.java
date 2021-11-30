package Lesson6_PrOOP;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public boolean decreaseFood (int n) {
        if (n > food) {
            System.out.println(" нельзя покормить, в тарелке не достаточно еды");
            return false;
        } else {
            food = food - n;
            System.out.println(" покормили");
        }
        return true;
    }

    public void addFood (int n) {
        food += n;
    }

    public void info () {
        System.out.println("Осталось еды в тарелке:" + food);
    }
}
