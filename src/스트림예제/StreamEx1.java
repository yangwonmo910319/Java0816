package 스트림예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림이란? : 함수형 프로그램을 이용하여 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
//-자료의 대상 상관없이 동일한 연산 수행
//-내부 반복자 사용(반복은 배제하기 위한 방법)
/*-원본 데이터를 변경하지 않음
-지연 연산과 병렬 처리 지원(성능 향상을 위한 방법)*/

public class StreamEx1 {
    static int e;
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.stream().filter(s->s.intValue()>=5).forEach(e -> System.out.println(   e) );
      // 위, 아래 같음
       list.stream().filter(s->s.intValue()>=5).forEach(System.out::println);
       int sumVal= list.stream().mapToInt(e->e).sum();
       int sumVal2= list.stream().filter((s->s.intValue()>=5)).mapToInt(e->e).sum();
        int sumVal3= list.stream().reduce(0,(e1,e2)->e1 + e2);
         System.out.println(   sumVal);
         System.out.println(   sumVal2);
         System.out.println(   sumVal3);
        int sumVal4= list.stream().filter((s->s.intValue()>=8)).reduce(0,(e1,e2)->e1 + e2);
        System.out.println(   sumVal4);
    }
}
