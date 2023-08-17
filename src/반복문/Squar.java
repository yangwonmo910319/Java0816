package 반복문;

import java.util.Scanner;

public class Squar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        int A = sc.nextInt();
        int B =0;
        for (int i=1; i<=A ; i++){
            for (int j=1; j<=A ; j++){
                B++;
                System.out.printf("%3d",B);
            }
            System.out.println();
        }
    }
}
