package 반복문;

public class Ex3 {
    public static void main(String[] args) {
        int r1,r2;
        int cnt =0;
        while (true){
            cnt++;
            r1=(int)((Math.random()*6)+1);
            r2=(int)((Math.random()*6)+1);
            if((r1+r2)==12){
                 System.out.println(cnt+"번만에 탈출"   );
            break;
            }else {
                System.out.println("추사위 합" +(r1+r2)  );
            }
        }
    }
}
