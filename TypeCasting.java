import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = (int)(23.45f);
        System.out.println(num1);

        int a = 258;
        byte b = (byte) (a);
        System.out.println(b);

        byte r = 20;
        byte s = 50;
        byte t = 50;
        int u = r * s / t;
        System.out.println(u);

        int number = 'a';
        System.out.println(number);

        int number1 = 'A';
        System.out.println(number1);

        byte a1 = 42;
        char b1 = 'c';
        short c1 = 1024;
        int d1 = 50000;
        float e1 = 5.67f;
        double f1 = 0.1234;
        double results = (e1 * a1) + (d1 / b1) - (f1 - c1);
        System.out.println((e1 * a1)+ " " +(d1 / b1)+" "+(f1 - c1));
        System.out.println(results);

        float num = sc.nextFloat();
        System.out.println(num);

    }
}
