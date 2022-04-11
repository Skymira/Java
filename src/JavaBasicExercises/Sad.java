package JavaBasicExercises;

public class Sad {
    public static void main(String[] args) {
        System.out.println(sum(45,5));
        System.out.println(minutes(5));
        System.out.println(next(5));
        check();

    }

    public static int sum(int i, int j){
        return i+j;
    }
    public static int minutes(int min){
        return min+60;
    }
    public static int next(int num){
        return num+1;
    }
    public static void check(){
        int num = 0;
        Boolean [] arr = new Boolean[5];
        arr = new Boolean[]{true, false, true, true, true};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true){
                num++;
            }

        }
        System.out.println(num);
    }



}
