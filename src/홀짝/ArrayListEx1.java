package 홀짝;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> h = new ArrayList<>();
        ArrayList<Integer> jj = new ArrayList<>();
         n.add(1);
         n.add(2);
         n.add(3);
         n.add(14);
         n.add(15);

        for (int i = 0; i < n.size(); i++) {
            if(n.get(i) % 2 == 0){
                jj.add(n.get(i));
            }else {
                h.add(n.get(i));
            }
        }
         System.out.println(n);
         System.out.println(h);
         System.out.println(jj);
        n.stream().filter(m -> m%2 ==0).forEach(e->  System.out.println(""+e));
       System.out.println(   jj.toString());

    }
}
