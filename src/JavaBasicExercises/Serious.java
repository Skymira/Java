package JavaBasicExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Serious {

    // https://techstudy.org/java/java-program-examples-with-output/
    //22 done
    public static void main(String[] args) {
        //System.out.println(sum(3,6));
        //System.out.println(prod(3,4));
        //calc();
        //avg();
        //swap();
        // checkJava();
        // decToBinary();
        //  sumOfTwoDigits();;
        //  compare();
        //  countChars();
        // ascii();
        // nn();
        //format();
        // odd();
        //even();
        // stringToInt();
        // convertToHour();
       // countArrEvenOdd();
       // squareRoot();
       // swapArr();
        palindrome(101);
        int sum = 1;
        int ctr = 0;
        int num = 0;

        while (ctr < 100) {
            num++;
            if (num % 2 != 0) {
                // check if the number is even
                if (is_Prime(num)) {
                    sum += num;
                    ctr++;
                }
            }
        }
        System.out.println("\nSum of the first 100 prime numbers is: "+sum);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int numm = in.nextInt();
        System.out.printf("Is %d is a palindrome number?\n",numm);
        System.out.println(palindrome(numm));


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static void calc() {
        int a = 12;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static void avg() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        System.out.println((a + b + c + d + e) / 5);
    }

    public static void swap() {
        int a = 5;
        int b = 10;
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void checkJava() {
        // checks if java is installed
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    public static void decToBinary() {
        // converts integer  to binary
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(21));
        System.out.println(Integer.toBinaryString(31));
    }

    public static void sumOfTwoDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number:");
        String str = input.next();


        int num = Integer.parseInt(String.valueOf(str.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(str.charAt(1)));
        int sum = num + num2;
        System.out.println(sum);

    }

    public static void compare() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ;

        if (a > b) {
            System.out.println(a + " is bigger!");
        } else {
            System.out.println(b + " is bigger");
        }

    }

    public static void countChars() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        int len = String.valueOf(word).length();

        System.out.println("Number of letters: " + len);

    }

    public static void ascii() {
        char a = 'A';
        // to check ascii value of a char cast it as int
        int ascii = (int) a;

        System.out.println(ascii);
    }

    public static void nn() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // if you give 1 it will say 1 +11 +111
        System.out.printf("%d + %d%d  + %d%d%d\n", num, num, num, num, num, num);

    }

    public static void format() {
        //check current date and time
        System.out.format("Time is: %tc%n", System.currentTimeMillis());
    }

    public static void odd() {


        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void even() {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void stringToInt() {
        String str = "453546";
        int conv = Integer.parseInt(str);
        System.out.println(conv);

    }

    public static void convertToHour() {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int a = input % 60;
        int b = input / 60;
        int c = b % 60;
        b = b / 60;
        System.out.println(b + ":" + c + ":" + a);

    }
    public static boolean is_Prime(int num) {
        for (int i = 3; i * i <= num; i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void swapArr(){
        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));

    }
    public static void countArrEvenOdd(){
        int [] arr = {1, 2, 3, 4, 5, 6};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even: "+countEven);
        System.out.println("Odd: "+countOdd);
    }
    public static void squareRoot(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int c = 0;
        if (a == 0 || a == 1){
            System.out.println("Doesnt have a square root");
        }

        for (int i = 0; i < a; i++) {
            b++;
            c++;
            if( b * c == a){
                System.out.println("Square root of: "+a+" is equal to: "+b);
                break;
            }



        }




    }

    private static boolean palindrome(int numm) {
        String str = String.valueOf(numm);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
    }















