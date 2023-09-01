package 쓰레드2;

import java.awt.*;

import static java.lang.Thread.sleep;

public class ThreadEx1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i <10; i++){
            toolkit.beep();
            try {
                sleep(3000);
            }catch (InterruptedException ignored){

            }
        }
    }
}
