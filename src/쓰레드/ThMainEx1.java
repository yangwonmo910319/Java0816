package 쓰레드;

public class ThMainEx1 {
    public static void main(String[] args) {
        //Thread 클래스 상속받아서 Thread 생성
Thread thread = new CustomThread();
thread.start();
        //Runnable  인터페이스를 상속 박아서 쓰레드 생성
 Runnable runnable = new InterThread();
 Thread runTh1 = new Thread(runnable);
 Thread runTh2 = new Thread(runnable);

        runTh1.start();
        runTh2.start();
        //익명 객체로 만드는 방법
        Runnable task=new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i =0; i<= 10;i++){
                    sum +=i ;
                    System.out.println(sum);
                    System.out.println(  "익명객체  스레드" );
                }
                System.out.println(Thread.currentThread()+"합"+sum);
            }

        };
        Thread anony = new Thread(task);
        anony.start();

        //람다식으로 구현
        Runnable task2= () -> {
            int sum=0;
            for(int i =0; i<= 10;i++){
                sum +=i ;
                System.out.println(sum);
                System.out.println(  "익명객체  스레드" );
            }
            System.out.println(Thread.currentThread()+"합"+sum);
        };
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

