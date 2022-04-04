    import org.w3c.dom.ls.LSOutput;

    import java.lang.reflect.Array;
    import java.util.Arrays;

    public class Lesson_3 {
        public static void main(String[] args) {
    // task one
            System.out.println("task one: ");
            int [] arrey = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            arrey = changeOneToZero(arrey);
            System.out.println(Arrays.toString(arrey));

    // task two
            System.out.println("task two: ");
            System.out.println(Arrays.toString(make100()));

    // task three
            System.out.println("task three: ");
            int[] arrey1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arrey1));
            increaseBY6(arrey1);
            System.out.println(Arrays.toString(arrey1));

    //task four
            System.out.println("task four: ");
            int[][] arrey2 = makeDiagonalArrey(7);

    //task five

            System.out.println("task five: ");
            int[] simpleArrey = makeSimpleArrey(9, 3);
            System.out.println(Arrays.toString(simpleArrey));

    //task six
            System.out.println("task six: " );
            int [] arrey3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 12, 11, 0};
            findMaxAndMinElement(arrey3);


    // task seven
            System.out.println("task seven: " );
            int[] arrey_one = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] arrey_two = {1, 2, 3, 4, 5, 6, 7, 8, 3};
            System.out.println(isEqualSides(arrey_one));
            System.out.println(isEqualSides(arrey_two));


    // task eight

            System.out.println("task eight: " );
            System.out.println(Arrays.toString(arrey_one));
            offsetElementArrey(arrey_one, -2);
            System.out.println(Arrays.toString(arrey_one));

        }



        static int[] changeOneToZero(int [] arr){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else arr[i] = 0;
            }
            return arr;
        }

        static int[] make100 (){
            int[] arrey = new int[100];
            for (int i = 0; i < 100; ){
                arrey[i] = ++i;
            }
            return arrey;
        }

        static void increaseBY6(int[] arr){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < 6){
                    arr[i] *= 2;
                }
            }
        }

        static int[][] makeDiagonalArrey(int a){
            int b = a;
            int[][] newArr = new int[a][b];
            for (int x = 0; x < a; x++){
                for (int y = 0; y < b; y++){
                    if(x == y){
                        newArr[x][y] = 1;
                        newArr[x][b-y-1] = 1;
                    }
                }
                System.out.println(Arrays.toString(newArr[x]));
            }
            return newArr;
        }

        static int[] makeSimpleArrey(int len, int initialValue){
            int [] newArrey = new int[len];
            for (int i = 0; i < len; i++) {
                newArrey[i] = initialValue;
            }
            return newArrey;
        }

        static private int minElement(int [] arr){

            int min  = arr[0];
            for (int i = 0; i < arr.length; i++){
                if (min > arr[i]){
                    min = arr[i];
                }
            }
            return min;
        }

        static private int maxElement(int [] arr){

            int max  = arr[0];
            for (int i = 0; i < arr.length; i++){
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }

        static void findMaxAndMinElement(int[] arr){
            System.out.println("the min element is " + minElement(arr));
            System.out.println("the max element is " + maxElement(arr));
        }

        static boolean isEqualSides(int[] arr){
            int cursor = 0;
            int leftSum = arr[cursor];
            int rightSum = arr[arr.length-1-cursor++];

            for (int i = 0; i < arr.length / 2 ; i++){

                if (leftSum == rightSum){
                    return true;
                }else {
                    if (leftSum > rightSum){
                       rightSum += arr[arr.length-cursor++];
                    } else {
                        leftSum += arr[++i];
                    }
                }
            }
            return false;
        }

        static void offsetElementArrey(int[] arr, int n){

            if (n > 0){
                positiveOffset(arr, n);
            }else {
                negativeOffset(arr, -n);
            }
        }

        static private void positiveOffset(int[] arr, int n){
            if (n > 0){
                int tmp = arr[0];
                for (int i = 0; i < arr.length-1; i++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = tmp;
                positiveOffset(arr, n-1);
            }
        }

        static private void negativeOffset(int[] arr, int n){
            if (n > 0){
                int tmp = arr[arr.length-1];
                for (int i = arr.length-1; i > 0; i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = tmp;
                negativeOffset(arr, n-1);
            }
        }
    }
