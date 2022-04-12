public class Lesson6 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat tom = new Cat("Tom");
        Cat barsik = new Cat("Barsik");
        Cat cat1 = new Cat();

        Dog dog = new Dog();
        Dog rex = new Dog("Rex");
        Dog lukky = new Dog("Lukky");

        cat.catInfo();
        barsik.catInfo();
        tom.catInfo();
        cat1.catInfo();

        dog.dogInfo();
        rex.dogInfo();
        lukky.dogInfo();

        cat1.run(300);
        cat.swim(100);
        tom.run(10);
        barsik.run(500);

        lukky.run(100);
        dog.swim(20);
        rex.run(700);
    }

}

abstract class Animal{

    static int counter;
    String name;
    static int swimLimit;
    static int runLimit;

    Animal(String name){
        this.name = name;
        counter = countAnimals();
    }

    int countAnimals(){
        return counter += 1;
    }

    protected void makeLimits(int limitSwim, int limitRun){
        swimLimit = limitSwim;
        runLimit = limitRun;
    }

    void swim(int meters){
        if (meters > swimLimit){
            System.out.println( name + " проплыл " + swimLimit + " метров и устал");
            return;
        }
        System.out.println( name + " проплыл " + meters + " метров");
    }

    void run(int meters){
        if (meters > runLimit){
            System.out.println( name + " пробежал " + runLimit + " метров и устал");
            return;
        }
        System.out.println( name + " пробежал " + meters + " метров");
    }

    void animalInfo(){
        System.out.println("это животное про него ничего не известно ");
    }
}


    class Cat extends Animal{

    static int counter;
    int catNumber;
    int amimalNumber;
    int runLimit = 200;


        {
            counter = countCats();
            catNumber = counter;
            amimalNumber = Animal.counter;
        }

    Cat(){
        super(" дворняга ");
    }

    Cat(String name){
        super(name);
    }

    int countCats(){
        return counter += 1;
    }

     void swim(int meters){
        System.out.println(" коты не плавают и "+ super.name + " не исключение ");
    }

    void run(int meters){
        if (meters > runLimit){
            System.out.println( name + " пробежал " + runLimit + " метров и устал");
            return;
        }
    }

    void catInfo(){
        System.out.println("это кот " + super.name + " кот номер " + catNumber + " всего животных = " + Animal.counter);
    }
}

class Dog extends Animal{

    static int counter;
    int dogNumber;
    int amimalNumber;

    {
        counter = countDogs();
        dogNumber = counter;
        amimalNumber = Animal.counter;
        makeLimits(10, 500);
    }

    Dog(){
        super(" двортерьер ");
    }

    Dog(String name){
        super(name);
    }

    int countDogs(){
        return counter += 1;
    }

    void dogInfo(){
        System.out.println("это собака " + super.name + " собака номер " + dogNumber + " всего животных = " + Animal.counter);
    }
}