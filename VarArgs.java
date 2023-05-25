import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("anjana", "kaviya", "Dopal", "Riya");
        multipleVar("anju", 'a', 2,3,6,1,8);
    }
    public static void multipleVar(String a, char b, int...c){
    }
    public static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
}
