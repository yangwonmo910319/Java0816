package 리스트;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//ArrayList 구조와 메소드가 동일,동기화가 지원되어 멀티쓰레드 환경에 안전
//ArrayList 에 비해 성능이 떨어진다.
public class VectorClass {
    public static void main(String[] args) {
 List<NameCard1> nameCard1List = new Vector<>();
        nameCard1List.add(new NameCard1("name","ww@ww","010","g"));
        nameCard1List.add(new NameCard1("name2","ww@223ww","02210","22g"));
        nameCard1List.add(new NameCard1("name3","ww@233w3w","01330","g33"));
for(NameCard1 e :nameCard1List){
     System.out.println(   e.name);
     System.out.println(   e.jobs);
     System.out.println(   e.mail);
     System.out.println(   e.phone);
}
 System.out.println(  "-----------------------------------" );
        List<NameCard1> nameCard1List2 = new LinkedList<>();
        nameCard1List2.add(new NameCard1("name","ww@ww","010","g"));
        for(NameCard1 e :nameCard1List2){
            System.out.println(   e.name);
            System.out.println(   e.jobs);
            System.out.println(   e.mail);
            System.out.println(   e.phone);
        }
    }

}
class NameCard1{
    String name ;
    String mail ;
    String phone ;
    String jobs ;

    public NameCard1(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}