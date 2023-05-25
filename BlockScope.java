public class BlockScope {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        String name = "Anjana";
        {
            a = 30;
            System.out.println(a);
            int c = 40;
            System.out.println(c);
            name = "Anjana";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
    }
}
