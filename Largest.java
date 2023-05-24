import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (max > b){
            max = b;
        } else if (max > c) {
            max = c;
        }
        System.out.println(max);

        int m = Math.max(2, Math.max(3, 5));
        System.out.println(m);
    }
}
