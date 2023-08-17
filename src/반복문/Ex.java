package 반복문;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간");
        int A = sc.nextInt();
        System.out.println("분");
        int B = sc.nextInt();
        int D = 60;
        if (B >= 45) {
            D = B - 45;
            System.out.printf("알람 시간 %d시 %d분 ", A, D);
        }
        if (B < 45) {
            D = B + 60 - 45;
            A = A - 1;
            if (A == -1) {
                System.out.println("하루 빠짐");
                A = 23;
                System.out.printf("전일 알람 시간 %d시 %d분 ", A, D);
            } else {
                System.out.printf("알람 시간 %d시 %d분 ", A, D);
            }
        }

    }
}
