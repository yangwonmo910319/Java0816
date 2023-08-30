package 리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exx11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int max = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < max; i++)
            num.add(sc.nextInt());
        System.out.println("입력받은 모든 수" + num.toString());
        System.out.println("작은수");
        num.stream().filter(m -> m < x).forEach(e -> System.out.print(" " + e));
    }}