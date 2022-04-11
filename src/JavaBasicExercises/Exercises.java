package JavaBasicExercises;

class Exercises {

    public static void main(String[] args) {
        /* First 5 exercises
        System.out.println("Hello\nWiktoria Demir");
        //System.out.println("Wiktoria Demir");
        System.out.println(74+36);
        System.out.println(50/3);
        int a = -5 + 8*6;
        int b = (55+9) % 9;
        int c = 20 + -3*5/8;
        int d = 5+15/3*2-8%3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1*num2;
        System.out.println(num1+ " x "+num2+" = "+sum);

         */
        /* Exercises 6
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+sum);
        sum = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+sum);
        sum = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+sum);
        sum = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+sum);
        sum = num1 % num2;
        System.out.println(num1+" mod "+num2+" = "+sum);
        */
         // Multiplication table
        /* From 7 - 11
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);

        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();

        System.out.println("Perimeter is = "+2*(double)Math.PI*radius);
        System.out.println("Area is = "+(double)Math.PI*radius*radius);

         */
        /* Average of 5 numbers (12)
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int sum = num1+num2+num3+num4+num5;
        System.out.println(sum/5);

         */
    final double width = 5.5;
    final double height = 8.5;
    System.out.println("Area is "+width+" * "+height+" = "+width*height);
        System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+2*(width+height));
        // swapping two variables
        int a = 5;
        int b = 10;
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a+" "+b);
        //sum of binary numbers skipped


    }
}