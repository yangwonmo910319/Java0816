//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ex1;

public class NameCard {
    private String name;
    private String mail;
    private String phoneNumber;
    private int age;

    public NameCard() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("연락처 : " + this.phoneNumber);
        System.out.println("메일 : " + this.mail);
    }
}
