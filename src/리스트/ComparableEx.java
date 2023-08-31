package 리스트;

import java.util.Iterator;
import java.util.TreeSet;

//Comparable,Comparator
public class ComparableEx {
    public static void main(String[] args) {
    TreeSet<CarComp> arrList = new TreeSet<>();
        arrList.add(new CarComp("싼타페", 2016, "초"));
        arrList.add(new CarComp("쏘렌토", 2012, "녹"));
        arrList.add(new CarComp("그랜저", 2018, "빨"));
        arrList.add(new CarComp("셀토스", 2011, "청"));
        arrList.add(new CarComp("코나", 2022, "황"));
        System.out.println(  "1" );
        Iterator<CarComp> iterator = arrList.iterator();
         System.out.println(  "3" );
        while(iterator.hasNext()) {
            CarComp car = iterator.next();

            System.out.println(car.modelName + ":" + car.modelYear+"."+car.color);
        }
        //for(CarComp e : arrList) {
        //    System.out.println(e.modelName + ":" + e.modelYear);
        //}
    }
}


