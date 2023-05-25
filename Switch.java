import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the name of the fruit : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("Yellow fruit");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Grapes":
                System.out.println("Green fruit");
                break;
            case "Orange":
                System.out.println("Orange fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
