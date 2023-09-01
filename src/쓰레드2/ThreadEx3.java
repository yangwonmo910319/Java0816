package 쓰레드2;
//쓰레드 간의 협업 : wait(), notify(), notifyAll()
//wait() 자신을 일시 정지 상태로 만듬
//notify() 일시 정지 상태에 있는 쓰레드를 실행대기 상태로 변경
// notifyAll()
public class ThreadEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 고유 객체 생성
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}
class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시 정지에 있는 ThreadB를 실행 대기 상태로 만듦
        try {
            wait();  // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
        }
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시 정지에 있는 ThreadA를 실행 대기 상태로 만듦
        try {
            wait();  // ThreadB를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
        }
    }
}
class ThreadA extends Thread {
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}
class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}