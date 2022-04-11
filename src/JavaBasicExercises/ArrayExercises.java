package JavaBasicExercises;

import java.util.Arrays;
// First 5 exercises about arrays
public class ArrayExercises {
    public static void main(String[] args) {
        sortArray();
        sumArray();
        printInLoop();
        calcArrayElements();
        int[] myarr = {1,2,3,4,5};
        System.out.println(contains(myarr,1));
        System.out.println(contains(myarr,6));


    }

    static void sortArray() {
        int[] arr = {2, 7, 19, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"Ismail", "Wiktoria", "Haze"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void sumArray() {
        // suming the array elements
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        System.out.print(sum);
        System.out.println();

    }

    static void printInLoop() {
        int[][] arr = new int[10][10];

        for (int row = 0; row < 10; row++) {

            for (int col = 0; col < 10; col++) {
                System.out.printf("-", arr[row][col]);
            }
            System.out.println();
        }
    }

    static void calcArrayElements() {

        int[] arr = {1, 2, 3, 4, 5, 6};
        double avg = 0.0;
        for (int i : arr) {
            avg += i;
        }
        System.out.println(avg / arr.length);

    }

// check if your array contains chosen number
static boolean contains(int[] arr, int item ){
            for (int n:arr) {
                if(item == n){
                    return true;
                }

            }
            return false;
        }
}

