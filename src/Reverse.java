import java.util.Arrays;
import java.util.Optional;

public class Reverse {
    public static void main(String[] args) {
        String str ="praveena";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String reversed;
        String[] arr = str.split("");
        Optional<String>  opt= Arrays.stream(arr).reduce((x, rev)->
              rev+x);
        reversed = opt.isPresent()?opt.get():str;
        return reversed;
    }
}
