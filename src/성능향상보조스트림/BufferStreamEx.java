package 성능향상보조스트림;

import java.io.*;

public class BufferStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =null;
        FileOutputStream fos =null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
       int  data= -1;
         long start = 0;
         long end = 0;
         /*
         fis = new FileInputStream("src/성능향상보조스트림/bear.jpg");
         bis=new BufferedInputStream(fis);
         fos = new FileOutputStream("d:/tmp/이미지2.jpg");
         while ((data =bis.read()) != -1){
             fos.write(data);
         }
         fos.flush();
         end = System.currentTimeMillis();
         fos.close();
         bis.close();
         fis.close();
          System.out.println( " 성능향상 보조 스트림을 사용하지 않은 경우"+(end - start)+"ms"  );
   */
        fis = new FileInputStream("src/성능향상보조스트림/bear.jpg");
        bis=new BufferedInputStream(fis);
        fos = new FileOutputStream("d:/tmp/이미지2.jpg");
        bos=new BufferedOutputStream(fos);
        while ((data=  bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        System.out.println( " 성능향상 보조 스트림을 사용하는 경우"+(end - start)+"ms"  );
    }
}
