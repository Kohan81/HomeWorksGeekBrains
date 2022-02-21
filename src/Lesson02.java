public class Lesson02 {
    public static void main(String[] args) {

        System.out.println(is10to20(12, 10));
        isPositive(-4);
        System.out.println(isNegative(9));
        System.out.println(leapYear(1000));
    }

    static boolean is10to20(int a, int b){

        if ((a + b) > 10 & (a + b) <= 20 ){
            return true;
        } else return false;
    }

    static void isPositive (int x){
        if (x >= 0){
            System.out.println("positive");
        }else System.out.println("negative");
    }

    static boolean isNegative (int x){
        if (x < 0){
            return true;
        }else return false;
    }

    static void repid(String str, int num){
        for (int i = 0; i < num; i++){
            System.out.println(str);
        }
    }

    static boolean leapYear(int year){

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
            }else return true;
        } else
            return false;
        return false;
    }
}
