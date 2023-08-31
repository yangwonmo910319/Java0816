package 쓰레드;

public class ThMainEx1 {
    public static void main(String[] args) {
Thread thread = new CustomThread();
thread.start();
 System.out.println(  "메인" );
 Runnable runnable = new InterThread();
 Thread runTh1 = new Thread(runnable);
    }
}
class CustomThread extends Thread{
    @Override
    public  void  run(){
        int sum=0;
        for(int i =0; i<= 10;i++){
            sum +=i ;
            System.out.println(sum);
            System.out.println(  "상속받은  스레드" );
        }
        System.out.println(Thread.currentThread()+"합"+sum);
    }

    }

