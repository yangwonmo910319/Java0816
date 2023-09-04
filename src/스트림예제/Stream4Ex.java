package 스트림예제;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


/*Files의 정적 메소드인 Lines()와 BuffeerdReader 의
Line() 메소드를 이용하여 문자 파일의 내용을 스트림을 통해 행 단위로 읽고 콘솔에 출력*/
public class Stream4Ex {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/스트림예제/test.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach( System.out::println );
         System.out.println(   );

         //BufferedReader의 Line() 메소드 이용
  File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach( System.out::println );
    }
}
