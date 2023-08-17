package 스위치문;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.next();
        System.out.println("제목");
        String title = sc.next();
        System.out.println("일시");
        String date = sc.next();
        System.out.println("시간");
        int cl = sc.nextInt();
        String month = date.substring(4, 6);
        String yy = date.substring(0, 4);
        String dd = date.substring(7, 8);

        System.out.println(name + "님");
        switch (month) {
            case "03":
                System.out.println("봄의기운이 느껴지는 3월입니다..");
                break;
            case "04":
                System.out.println("새싹이 피어나는 4월입니다.");
                break;
            case "05":
                System.out.println("계절의 여왕 5월입니다.");
                break;
            case "06":
                System.out.println("활동하기 좋은 6월 입니다..");
                break;
            case "07":
                System.out.println("휴가가 기다려지는 7월 입니다.");
                break;
            case "08":
                System.out.println("무더운 8월 입니다.");
                break;
            case "09":
                System.out.println("선선한 9월 입니다.");
                break;
            case "10":
                System.out.println("천고마비의 계절 10월 입니다.");
                break;
            case "11":
                System.out.println("쓸쓸한 늦가을 11월 입니다.");
                break;
            default:
                System.out.println("한파의 연속인 1월입니다.");
        }

        System.out.println("아래와 일정으로 [" + title + "]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.\n");
        System.out.println("===== 행사 안내 =====");
        System.out.println("=**=".repeat(5));
        System.out.println(" 행사 안내 : [" + title + "]");
        System.out.println("일시 : [" + yy + "]년 [" + month + "]월 [" + dd + "]일");
        System.out.println("시간 : [" + cl + "]시");
    }
}
