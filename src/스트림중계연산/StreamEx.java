package 스트림중계연산;
/*
생성된 스트림은 중간 연산을 톨해 또 다른 스트림으로 변환됩니다.
1: 필터링:
-filter() - 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
-fistinct() - 중복된 요소가 제거된 새로운 스트림 생성
2.스트림 변환 :
- map() : 해당 스트림의 요소들을 함수에 인수로 전달하여, 스 변환값으로 이루어진 새로운 스트림을 만듬
-flatMap() : 중복 요소가 제거된 새로운 스트림 행성
3.제한
-limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림 생성
-skip() : 해당 스트림의 첫 번쨰 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림 생성


*/

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(4, 5, 8, 4, 6, 8, 5, 4);
        IntStream stream2 = IntStream.of(4, 5, 8, 4, 6, 8, 5, 4);
        //중복값 제거
        stream1.distinct().forEach(value -> System.out.print(value));
        System.out.println();
        //조건에 맞는 요소만으로 구성된 새로운 스트림 생성
        stream2.filter(e -> e % 2 != 0).forEach(var -> System.out.print(var));
 Stream<String> stream = Stream.of("s","s22","s","asd","sassd");
stream.map(e->e.length()).forEach( System.out::println);
        Stream<String> stream4 = Stream.of("aa","ss","bb","cc","ee");
         stream4.flatMap(a-> Stream.of(a.split(" +"))).forEach(System.out::println);

         IntStream stream5 = IntStream.range(0,10);
         IntStream stream6 = IntStream.range(0,10);
         IntStream stream7 = IntStream.range(0,10);
         //skip 전달된 요소의 개수만큼 제외
         stream5.skip(4).forEach(e-> System.out.println(  "xx"+ e));
          System.out.println(   );
     //첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
        stream6.limit(3).forEach(e-> System.out.println(  "dd"+ e));
        //
        stream7.skip(4).limit(2).forEach(e-> System.out.println(  "aa"+ e));
        System.out.println(   );

        Stream<String> stream8 = Stream.of("qqqq","Wwww","oooo","gggg");
        Stream<String> stream9 = Stream.of("qqqq","Wwww","oooo","gggg");

    }
}
