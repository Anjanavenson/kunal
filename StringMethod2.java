public class StringMethod2 {
    public static void main(String[] args) {
        String Content = greet("Anjana");
        System.out.println(Content);
    }
    public static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
