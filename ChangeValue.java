import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] num){
        num[3] = 9;
    }
}
