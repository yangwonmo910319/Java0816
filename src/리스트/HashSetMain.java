package 리스트;

import java.util.Arrays;
import java.util.HashSet;

//중복 허용하지 않음, 순서 보장하지 않음 , 수학의 집합과 유사
public class HashSetMain {
    public static void main(String[] args) {

        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        System.out.println("객체 저장끝");
        System.out.println("객체 추가");
        hashSet.add(new Member(1003, "카리나"));
        for (Member e : hashSet) e.showMember();

    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("같은게 있음");
        if (obj instanceof Member) {
            Member member = (Member) obj;
            System.out.println(member.name);

            if (this.id == member.id) {
                return true;    //true = 저장x false =  같은값있어도 저장
            } else return false;
        }


        return false;
    }



    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("객체 만듬" + name);
    }

    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}

