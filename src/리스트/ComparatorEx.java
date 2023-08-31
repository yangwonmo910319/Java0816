package 리스트;

import java.util.Iterator;
import java.util.TreeSet;

//두개의 메소드를 비쇼하는 방법
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> Set = new TreeSet<>(new DescendingComparator());
        Set.add(new Fruit("포도", 3000));
        Set.add(new Fruit("수박", 10000));
        Set.add(new Fruit("딸기", 6000));
     /*   Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }*/
        for(Fruit e : Set){
             System.out.println(   e.name);
             System.out.println(   e.price);

        }
    }
}