package 스위치문;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계절 입력");
        String S= sc.next();
        switch (S){
            case "겨울":
             System.out.println("겨울");
           break;
            case "봄":
                System.out.println("봄");
                break;
            case "여름":
                System.out.println("여름");
                break;
            case "단풍":
                System.out.println("단풍");
            case "가을":
                System.out.println("가을");
                break;
            default:   System.out.println("옶음");

        }

    }
}
