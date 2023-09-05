package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName="src/파일복사하기/이미지.jpg";
        String targetFileName="d:tmp/bear.jpg";

        FileInputStream fis =new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);
    int readByteNo;
    byte[] readBytes = new byte[100];
    while ((readByteNo = fis.read(readBytes) )!= -1){
        fos.write(readBytes,0,readByteNo);
    }
    fos.flush();
    fos.close();
    fis.close();

    }
}
