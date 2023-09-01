package 쓰레드2;

public class ThreadEx2 {
    public static void main(String[] args) throws InterruptedException {
        SumThread thread =new SumThread();
        thread.start();
     /*   thread.sleep(1);*/
        try {
            thread.join();//sumThread가 작업을 완료할때까지 대기

        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
         System.out.println( thread.getSum()  );
    }
}
class SumThread extends  Thread{
    private  long sum;

    public SumThread() {
        this.sum = sum;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public  void run(){
        for(int i = 0; i <100000000; i++){
            sum +=1;
        }

    }
}
