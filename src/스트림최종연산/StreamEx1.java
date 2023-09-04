package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a","b","c","d");
        Stream<String> stream2 = Stream.of("a","b","c","d");
        Optional<String>  rst1 = stream1.reduce((s1,s2)->s1+"++"+s2);
      rst1.ifPresent(e->System.out.println(e));

      String rst2 = stream2.reduce("시작",(s1,s2)->s1+"++"+s2);
         System.out.println(  rst2 );
    }
}
