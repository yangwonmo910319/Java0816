package 스트림예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//반복자 스트림 forEach() : 내부 반복자,스트림 요소에 순차 접근을 제공하며,최종 연산에 해당 합니다.,
public class StreamEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("강","중","하"));
        for(String e: list){
             System.out.println( e  );
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name= iterator.next();
             System.out.println(  name );
        }
    }
}
