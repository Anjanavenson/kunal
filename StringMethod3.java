import java.util.Scanner;

public class StringMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        String Content = greet(name);
        System.out.println(Content);
    }
    public static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
