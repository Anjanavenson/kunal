public class Overloading {
    public static void main(String[] args) {
        fun(2);
        fun("anju");
    }
    public static void fun(int a){
        System.out.println(a);
    }
    public static void fun(String name){
        System.out.println(name);
    }
}
