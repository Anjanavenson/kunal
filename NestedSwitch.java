import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empId : ");
        int empId = sc.nextInt();

        switch (empId){
            case 1:
                System.out.println("Anjana");
                break;
            case 2:
                System.out.println("Kaviya");
                break;
            case 3:
                System.out.println("Riya");
                break;
            case 4:
                System.out.println("Emp No.4");
                System.out.println("Enter the department : ");
                String department = sc.next();
                switch (department){
                    case ("IT"):
                        System.out.println("IT Department");
                        break;
                    case ("CSE"):
                        System.out.println("CSE Department");
                        break;
                    case ("ECE"):
                        System.out.println("ECE Department");
                        break;
                    default:
                        System.out.println("No department matched");
                }
            default:
                System.out.println("No name matched");
        }
    }
}
