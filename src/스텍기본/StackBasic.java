package 스텍기본;

import java.util.Stack;

//LIFO 구조
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

         System.out.println(  stack.peek());
         System.out.println(  stack.pop() );
         System.out.println(  stack.empty() );
         System.out.println(  stack.size() );
         System.out.println(  stack.contains(3) );
         System.out.println(  stack.contains(5) );
         System.out.println(  stack.pop() );
         System.out.println(  stack.pop() );
    }
}
