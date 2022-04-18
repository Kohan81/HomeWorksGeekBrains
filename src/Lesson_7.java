public class Lesson_7 {
    public static void main(String[] args) {

        Plate plate = new Plate(30);
        plate.info();


        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Vaily", 20);
        cats[2] = new Cat("Ryjyk", 15);
        cats[3] = new Cat("Snejok", 10);
        cats[4] = new Cat("Murka", 5);

        feed(cats, plate);

        plate.addFood(30);

        feed(cats, plate);

    }

    static void feed(Cat[] cats, Plate plate){
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " поел?  " + cat.fullness);
        }

        plate.info();
    }

}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (food >= n){
            food -= n;
        } else {
            System.out.println("еды не хватает ");
           return;
        }

    }
    public void info() {
        System.out.println("plate: " + food);
    }

    void addFood(int addition){
        food += addition;
    }
}


class Cat {
    boolean fullness = false;
    private final String name;
    private final int appetite;

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (fullness){
            return;
        }
        if(p.getFood() >= appetite){
            p.decreaseFood(appetite);
            fullness = true;
        }else{
            return;
        }

    }
}
