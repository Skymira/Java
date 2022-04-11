package JavaBasicExercises;


import java.util.Arrays;

// Write a Java program to find the index of an array element
// Write a Java program to remove a specific element from an array
//Write a Java program to find the maximum and minimum value of an array
public class Day2Arrays {

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 10, 12};
        System.out.println(indexOfArray(arr,1));
        int [] arr1 = {1, 2, 3, 4, 5, 6};
        removeFromArray(arr1, 4);
        int [] arr3 = {1, 23, 7};
        maxOf(arr3);


    }
    static int indexOfArray(int[] arr,int t) {
        int len = arr.length;
        int i = 0;
        while(i < len){
            if(arr[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    static void removeFromArray(int[] arr1, int input){
        int temp = 0;
        int len = arr1.length;
        for (int i = 1; i < arr1.length-1; i++) {

            if(input == arr1[i]){
                
                arr1[i] = arr1[i+1];
                System.out.println(Arrays.toString(arr1));
            }

        }
    }
    static void maxOf(int [] arr3){
        int max = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (max > arr3[i]){
                max = arr3[i];
                System.out.println(max);
            }
        }
    }

}