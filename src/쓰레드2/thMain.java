package 쓰레드2;

import static java.lang.Thread.sleep;

public class thMain {
    public static void main(String[] args) throws InterruptedException {
        RunTread runTread = new RunTread();
        runTread.start();
        try {
            sleep(1);

        } catch (InterruptedException e) {

        }
        runTread.interrupt();


    }

    }
class RunTread extends Thread {
        private boolean stop; // stop 플래그 설정

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        public void run() {
            while (true) {
                System.out.println("Thread 실행 중...");
            }
        }
    }

