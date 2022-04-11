package JavaBasicExercises;

public class StringsExercises {
    public static void main(String[] args) {
    String ori = "Java Exercises!";
    System.out.println(ori.charAt(0));
    String v = "w3resource.com";
    int val1 = v.codePointAt(1);
    System.out.println(val1);
    int val2 = v.codePointAt(9);
    System.out.println(val2);
    int str = v.codePointCount(1,10);
    System.out.println(str);


    String string1 = "PHP Exercises and";
    String string2 = "Pyhton Exercises";
    System.out.println("The concatendated string: "+string1+" "+string2);
    String again = "PHP Exercises and Pyhton Exercises";
    String str3 = "and";
    System.out.println(again.contains(str3));
    }
}
