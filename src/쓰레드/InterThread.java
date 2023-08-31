package 쓰레드;

public class InterThread implements Runnable {
    @Override
    public void run() {
        int sum=0;
        for(int i =0; i<= 10;i++){
            sum +=i ;
            System.out.println(sum);
            System.out.println(  "인터페이스 스레드" );
        }
        System.out.println(Thread.currentThread()+"합"+sum);
    }
}
