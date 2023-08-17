package 반복문;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        char C = 0;
        int sum = 0;
        for (int i = 0; i < A; i++) {
            C = B.charAt(i);
            sum = sum + (C - '0');
        }
        System.out.println("합" + sum);
    }
}
