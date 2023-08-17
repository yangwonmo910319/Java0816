package 스위치문;

import java.util.Scanner;

public class CalcSwitchEx {
    public static void main(String[] args) {
        int x,y;
        char ch;
        Scanner sc = new Scanner(System.in);
      x= sc.nextInt();
     ch=sc.next().charAt(0);
      y= sc.nextInt();
switch (ch){
    case '+' :
         System.out.println( x+y );
 break;
    case '-' :
        System.out.println( x-y );
        break;
    case '*' :
        System.out.println( x*y );
        break;
    case '/' :
        System.out.println( (double) x/y );
        break;
    default:    System.out.println( "잘못입력" );
}
    }
}
