package 스위치문;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");


        while (true) {
            int num = sc.nextInt();

            if(num < 0 || num > 100) {
                System.out.println("다시 입력");
                continue;
            }

            if (90 < num && num <= 100) {
                System.out.println("A");
                break;
            } else if (80 < num && num < 89) {
                System.out.println("B");
                break;
            } else if (70 < num && num < 79) {
                System.out.println("c");
                break;
            } else if (60 < num && num < 69) {
                System.out.println("d");
                break;

            }else {
                System.out.println("f");
                break;
            }




        }

    }
}




