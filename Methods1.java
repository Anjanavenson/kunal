import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two numbers is : "+sum);
    }
    public static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
