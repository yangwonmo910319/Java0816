package 홀짝;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.a();

    }
}

class Ex2 {
    void a() {
        int[] n = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int A = sc.nextInt();
            n[i] = A;
        }
        Ex3 ex3 = new Ex3();
        ex3.a(n);
    }
}

class Ex3 {


    void a(int[] n) {
        int[] h =  new int[n.length];
        int[] jj = new int[n.length];
        int b = 0, c= 0;
        for (int j = 0; j < n.length; j++) {
            if (n[j] % 2 == 0) {
                jj[b++] = n[j];

            } else {
                h[c] = n[j];
                c++;
            }
        }
        int[] h2 = new int[c];
        int[] jj2 = new int[b];
        for (int j = 0; j < c; j++) {
            h2[j] = h[j];
        }
        for (int j = 0; j < b; j++) {
            jj2[j] = jj[j];
        }
        Ex4 ex4 = new Ex4();
        ex4.a(h2, jj2);
    }
}

class Ex4 {
    void a(int[] h2, int[] jj2) {

        System.out.println("홀");
        Arrays.sort(h2);
        Arrays.sort(jj2);
        System.out.println(Arrays.toString(h2));
        System.out.println("짝");
        System.out.println(Arrays.toString(jj2));
        System.out.println(Arrays.toString(h2));

    }
}
