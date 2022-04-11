package JavaBasicExercises;

public class NewExercises {
    public static void main(String[] args) {

        // STRINGS PROGRAMS
        // 6 / 13 DONE
       // con();
       // toLower();
       // trim();
       // getSubString();
       // replaceString();

    }


    public static void con(){
        String str = "Java ";
        String str1 = "is cool";
        System.out.println(str+str1);
    }
    public static void toLower(){
        String str = "JAVA IS COOL IN LOWER CASE";
        System.out.println(str.toLowerCase());
    }
    public static void trim(){
        String str = "     lots of spaces in here    ";

        System.out.println(str.trim());
    }
    public static void getSubString(){
        String str = "Java is awesome";
        System.out.println(str.substring(1, 3));
    }
    public static void replaceString(){
        String str = "dom domek";
        System.out.println(str.replace('d','f'));
    }

}
