package 반복문;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char C;
        for (int i = A.length(); i > 0; i--) {
            System.out.print(  C = A.charAt(i - 1));
        }
    }
}
