package 반복문;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int B = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%4d", i);
                B++;
            }
            if (B == 10) {
                System.out.println();
                B = 0;
            }
        }
    }
}
