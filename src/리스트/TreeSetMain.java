package 리스트;

import java.util.Iterator;
import java.util.TreeSet;

//검색 기능을 강화시킨 자료구조
//데이터가 저장될 때 이진 검색 트리로 저장되고,
// 검색 할때 inOrder(Left-Root-Right) 방식으로 검색 함
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        // Enhanced for 문
        for(int e : ts) System.out.println(e + " ");

        // remove()메소드로 요소의 제거
        ts.remove(40);

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : " + ts.size());

        // subSet() 메소드를 이용한 부분 집합의 출력
        System.out.println(ts.subSet(10, 20));
    }

}
