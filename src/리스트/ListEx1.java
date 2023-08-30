package 리스트;

import 시스템출력.SystemOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();

        MenuInfo menuInfo01 = new MenuInfo("Americano", 2000, true);
        menuList.add(menuInfo01);
        menuList.add(new MenuInfo("Latte", 4000, true));
        menuList.add(new MenuInfo("Espresso", 2500, true));


        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getJsonFormat());
        }



         System.out.println(  menuList.toString());
         System.out.println(Arrays.toString(menuList.toArray()));

         System.out.println(menuList.get(0).name);
         System.out.println(  menuList.get(0).getJsonFormat() );
         System.out.println(  menuList.get(2).getJsonFormat() );

        System.out.println(  menuList.size());
        System.out.println(  Arrays.deepToString(menuList.toArray()));




    }
}


