public class IfLoop {
    public static void main(String[] args) throws Exception {
        if (true){
            System.out.println("Hello");
        }

        int a=100;
        if (a == 10){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        int salary = 15000;
        if (salary > 10000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        int sal = 30000;
        if (sal < 10000){
            sal += 2000;
        } else if (sal > 20000) {
            sal += 3000;
        }else {
            throw new Exception("Not valid");
        }
        System.out.println(sal);

        int a1 = 10;
        int b1 = 20;
        if (a1 == 10 && b1 == 20){
            System.out.println("Crt");
        }
        if (a1 == 10 || b1 == 20) {
            System.out.println("true");
        }
    }
}
