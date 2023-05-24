import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=10; i++){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (i=1; i <= n; i++){
            System.out.println(i +" ");
        }
    }
}
