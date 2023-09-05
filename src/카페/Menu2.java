package 카페;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu2 {
    static Map<String, MenuInfo> map = new HashMap<>();

    //                 키 ,   객체 값(클라스 명)
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }

    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2000, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 3000, "Coffee", "우유 포함 커피"));

    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String Key = "";
        while (true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.println("[1]메뉴 보기 [2]메뉴 조회 [3]메뉴 추가[4]메뉴 삭제 [5]메뉴 수정");
            int mm = sc.nextInt();
            String key = "";

            switch (mm) {
                case 1: {
                    System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescrition());
                        System.out.println("=".repeat(25));

                    }
                    break;
                }
                case 2:
                    System.out.println("조회할 매뉴를 입력하세요");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescrition());
                    } else {
                        System.out.println("해당 메뉴가 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.println("추가 할 메뉴를 입력해 주세요");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.println("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.println("분류 입력 :");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.println("설명 입력 :");
                        String descrition = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, descrition));


                    }

                    break;
                case 4:
                    System.out.println("삭제할 메뉴를 입력하세요");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("메뉴를 삭제했습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("수정 전 메뉴를 입력하세요.");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("수정 할 메뉴를 입력하세요.");
                         String key2 = sc.next();
                        System.out.println("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.println("분류 입력 :");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.println("설명 입력 :");
                        String descrition = sc.nextLine();
                        map.replace(key, new MenuInfo(key2, price, category, descrition));
                    }
                    System.out.println("수정 할 메뉴가 없습니다.");
                    break;
                case 6:
                    System.out.println("종료");
                    return;
                //System.exit(0); 강제종료

                default:
                    System.out.println("잘못 선택");
            }

        }

    }


}
