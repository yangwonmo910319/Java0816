package 리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<MenuInfo1> menuList = new ArrayList<>();

        MenuInfo1 menuInfo01 = new MenuInfo1("Americano", 2000, true);
        menuList.add(menuInfo01);
        menuList.add(new MenuInfo1("Latte", 4000, true));
        menuList.add(new MenuInfo1("Espresso", 2500, true));


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
   int x=menuList.get(0).price;

        for(int i =0 ;i<  menuList.size(); i++){

            for(int j =1 ;j<  menuList.size(); j++){
            if(menuList.get(i).price<menuList.get(j).price) {
                x=menuList.get(j).price;
             System.out.println(   x);
            }
            }
        }
        int y=1;

     System.out.printf( "%02d",y  );



    }
}


