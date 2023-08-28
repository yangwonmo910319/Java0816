//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ex1;

import java.io.PrintStream;
import java.util.Scanner;

public class Card{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];
        PrintStream var10000 = System.out;
        String var10001 = "-".repeat(7);
        var10000.println(var10001 + "정보 입력" + "-".repeat(7));
        System.out.println("----------------------");

        for(int i = 0; i < nameCards.length; ++i) {
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
            nameCards[i].setPhoneNumber(sc.next());
        }

        NameCard[] var8 = nameCards;
        int var5 = nameCards.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            NameCard d = var8[var6];
            d.printInfo();
        }

    }
}
