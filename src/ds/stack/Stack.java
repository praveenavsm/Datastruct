package ds.stack;

import java.util.EmptyStackException;

public class Stack {
    static class Node{
        Character c ;
        Node next;

        public Node(char c){
            this.c = c;
        }
    }

    private Node top;

    public Character pop(){
        if(isEmpty()){ return null;}
        else{
            Character c = top.c;
            top = top.next;
            return c;
        }
    }

    public void push(Character c){
        Node node = new Node(c);
        if(top == null) top = node;
        else {
            node.next = top;
            top = node;
        }
    }

    public boolean isEmpty(){
        return (top==null) ;
    }

    public Character peek(){
        if(isEmpty()){ return null;}
        else
            return top.c;
    }
}
