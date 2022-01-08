package ds.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String str = "praveena";
        for(int i =0;i<str.length();i++){
             stack.push(str.charAt(i));
        }

        while(stack.peek() != null){
            System.out.print(stack.pop());
        }

    }

}
