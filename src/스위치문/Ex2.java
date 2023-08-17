package 스위치문;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "정수 입력"  );
        int  num=sc.nextInt();
        int a = num / 100;
        System.out.println( "100자리"+a  );
        int b = (num % 100) / 10;
        System.out.println( "10자리"  +b);
        int c = num % 10;
        System.out.println( "1자리"+c  );
        if(b<a&&a>c){
            System.out.println("100자리 가장 큼");
        }else if(b>a&&b>c){
            System.out.println("10자리 가장 큼");
        }else {
            System.out.println("1자리 가장 큼");
        }

    }
}
