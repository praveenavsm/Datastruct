import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int i = -1234;

        System.out.println(reverse(i));
    }

    public static int reverse(int val){
        String str = Integer.toString(Math.abs(val));
        String reversed="";
        String[] arr = str.split("");
        reversed = Arrays.stream(arr).reduce((x, rev)->{
           return rev+x;}).get();
        int j = Integer.parseInt( reversed );
        if(val < 0) j = j * -1;
        return j;
    }
}
