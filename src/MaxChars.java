import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class MaxChars {
    public static void main(String[] args) {
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"
        System.out.println(maxChars("abcd"));
        System.out.println(maxChars("apple 1231111"));
    }
    public static Character maxChars(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            int val = 1;
            if(map.containsKey(str.charAt(i))) {
                val=map.get(str.charAt(i));
                val++;
            }
            map.put(str.charAt(i),val);
        }
        int max=0;
        Character maxChr='\u0000';
        for (Character c:map.keySet()) {
           if( map.get(c) > max ){
               maxChr=c;
               max = map.get(c);
           }
        }
        return maxChr;
    }
}
