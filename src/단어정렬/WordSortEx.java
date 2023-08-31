package 단어정렬;
//알파멧 소문자 n개 -> n의 개수를 입력받음->길이 짧은것 ->사전 순 -> 중복 제거

import 리스트.DescendingComparator;
import 리스트.Fruit;
import 학생성적정렬.Student;

import java.util.*;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        String[] word=new String[n];
        for(int i =0;i<word.length;i++){
            word[i]=sc.next();

        }
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
     word = set.toArray(new String [0]);

Arrays.sort(word, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
       if(o1.length()==o2.length()) return o1.compareTo(o2);//사전순
       else {
           return o1.length() - o2.length();//양수
       }
    }

});


        System.out.println(Arrays.toString(word));

        }
    }

