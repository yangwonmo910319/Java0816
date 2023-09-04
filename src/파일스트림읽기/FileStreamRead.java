package 파일스트림읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream input=null;
     try {
         input = new FileInputStream("src/일스트림읽기/ABA.txt");
     }catch (FileNotFoundException e){
       e.printStackTrace();
          System.out.println( e.getMessage() );
     }
    }
}
