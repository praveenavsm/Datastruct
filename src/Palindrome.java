public class Palindrome {
    public static void main(String[] args) {
     //"aba" is a palindrome
        //  ✓ " aba" is not a palindrome
        //  ✓ "aba " is not a palindrome (1 ms)
        //  ✓ "greetings" is not a palindrome
        //  ✓ "1000000001" a palindrome
        //  ✓ "Fish hsif" is not a palindrome
        //  ✓ "pennep" a palindrome
        String str = "p";
        System.out.printf("Is %s a palindrome ? %s",str, isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while(i < j ){
            System.out.println("I:"+i+",j:"+j);
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
