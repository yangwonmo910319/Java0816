package 바이트스트림;
//OutputStream : 바이트 기반 출력 스트림의 최상위 추상클래스


import java.io.*;

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
/*        OutputStream os = new FileOutputStream("test.bin");
        byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a);
        os.write(b);
        os.write(c);
        OutputStream os2 = new FileOutputStream("test2.bin");
        byte[] array ={1,2,3};

        os.write(array);*/
      OutputStream os3 = new FileOutputStream("test3.bin");
        byte[] array ={1,2,3,4,5};
         os3.write(array,1,3);
        os3.flush();//버퍼 비우기
        os3.close();//자원 반납 후 스트림 다기
/*        InputStream is = new FileInputStream("test3.bin");*/
//읽는법 1
        /*        while (true) {
            int data = is.read();//1바이트씩 읽음
            if (data == -1) {
                break;
            }
             System.out.println(  data );
        }*/
        //읽는법 2
/*        byte[] buffer = new byte[100];
        while (true) {
            int read =is.read(buffer);
            if (read == -1) {
                break;
            } for(int i =0;i<read;i++){
                System.out.println(  read);
            }
        }*/
    }
}
