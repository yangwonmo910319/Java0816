package 반복문;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        do {
            System.out.println("나이 입력");
            age = sc.nextInt();
        } while (age <= 0 || age > 100);
        System.out.println("입력한 나이 "+age);

    }
    }

