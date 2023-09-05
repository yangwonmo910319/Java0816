package 텍스트파일읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {


        FileInputStream input = null;
        try {
            FileInputStream fis = new FileInputStream("src/텍스트파일읽기/Test.txt");
            byte[] buffer = new byte[100];
            while (true) {
                int read =fis.read(buffer);
                if (read == -1) {
                    break;
                } for(int i =0;i<read;i++){
                    System.out.println( "xx!"+ read);
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


