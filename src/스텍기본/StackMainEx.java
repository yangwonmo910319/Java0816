package 스텍기본;

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
         System.out.println( "수식 입력 :"  );
         String exp= sc.next();
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                stack.push(ch); // 열림 괄호 일 때 push
            } else if(ch == ')') {
                if(!stack.isEmpty())
                    stack.pop(); // 닫힘 괄호 일 때 pop
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }

    }
}