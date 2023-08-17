package 반복문;

import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");

        int A= sc.nextInt();
        for(int i=1;i<=A;i++){
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }System.out.print("\n");
        }

    }
}
