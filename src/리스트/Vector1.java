package 리스트;

import java.util.List;
import java.util.Vector;

public class Vector1 {


    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-5678", "변호사"));
        list.add(new NameCard("동그라마", "ddd@gmail.com", "010-1234-5678", "무직"));
        list.add(new NameCard("ljh@g111mail.com", "010-1234-5678", "회사원"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String task) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = task;
    }
    public NameCard( String mail, String phone, String task) {
           this.mail = mail;
        this.phone = phone;
        this.jobs = task;
    }
}