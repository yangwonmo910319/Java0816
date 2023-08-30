package 리스트;

import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println(   "입력");
         String a=sc.next();
         int sum=0;
         for (int i=0;i<a.length();i++){

             sum+=a.charAt(i);

         }

          System.out.println(  "배열 인덱스"+(sum%100) );

    }
/*    String sum="";
         for (int i=0;i<a.length();i++){

        sum+=a.charAt(i);
        System.out.println( sum );

    }*/
}
