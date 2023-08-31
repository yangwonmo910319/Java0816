package 전자레인지;

import java.util.Scanner;

//5,10,10초 3개버튼 전자레인지-> 누를떄마다 더해진다
//초단위 표시 ->최소 버튼으로 표시
public class Ex1 {
    public static void main(String[] args) {
 int a=10;//5초
        int b=300;//300초
        int c=60;
        int time=0;

        Scanner sc = new Scanner(System.in);
       time= sc.nextInt();
        int count1=time/b;
        int count2=(time%b)/c;

        int count3=(time%b%c)/a;
        int count4=(time%b%c)%a;
        if(time>1&&time<1000) {
            if (count4 == 0) {
                System.out.println("B 5분" + count1);
                System.out.println("C 1분" + count2);
                System.out.println("A 10초" + count3);
            } else {
                System.out.println("-1");
            }
        }
    }
}
