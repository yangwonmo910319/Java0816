package 반복문;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        while (true){
             age = sc.nextInt();
            if(age>0 &&age<200) break;

             System.out.println(  "나이 잘못 입력" );

        }
        System.out.println(  "입력한 나이는"+age+"입니다." );
        }

}
