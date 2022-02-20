public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println(checkSumSign());
        System.out.println(printColor());
        System.out.println(compareNumbers());
    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static String checkSumSign(){
        int a = 1;
        int b = 3;
        if ((a + b) > 0){
            return "Сумма положительная";
        } else return "Сумма отрицательная";
    }

    static String printColor(){
        int value = 7;

        if (value <= 0){
            return "Красный";
        } else if (value <= 100){
            return "Желтый";
        } else return "Зеленый";
    }

    static String compareNumbers(){
        int a = 2;
        int b = -3;

        if (a >= b){
            return "a >= b";
        } else return "a < b";
    }
}
