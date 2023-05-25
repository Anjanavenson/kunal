public class Shadowing {
    static int x=56;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 5;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
