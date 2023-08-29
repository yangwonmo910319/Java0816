package 리스트;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2000, true));
        menuList.add(new MenuInfo("Latte", 4000, true));
        menuList.add(new MenuInfo("Espresso", 2500, true));

        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getJsonFormat());
        }
         System.out.println(  menuList.toString());
         System.out.println(Arrays.toString(menuList.toArray()));
         System.out.println(menuList.get(0).name);


    }
}


