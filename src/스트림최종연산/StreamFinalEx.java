package 스트림최종연산;

import java.util.ArrayList;
import java.util.List;

public class StreamFinalEx {
    public static void main(String[] args) {
        TravelCustomer customerA= new TravelCustomer("강",15,1000);
        TravelCustomer customerB= new TravelCustomer("중",20,2000);
        TravelCustomer customerC = new TravelCustomer("하",10,3000);
     List<TravelCustomer> customerList =new ArrayList<>();
     customerList.add(customerA);
     customerList.add(customerB);
     customerList.add(customerC);
     customerList.add(new TravelCustomer("뉴",30,4200));
  //
     System.out.println( "=".repeat(5)+"고객 명단 출력"+"=".repeat(5)  );
     customerList.stream().map(c->c.getName()).forEach(c-> System.out.println(c   ));
   //지불한 비용
int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
 System.out.println(   "총 여행 비용"+total);
 //20세 이상 성인만 출력
        System.out.println( "=".repeat(5)+"성인 먕딘 출력"+"=".repeat(5)  );
customerList.stream()
        .filter(c->c.getAge() >=20)
        .map(c->c.getName())
        .sorted()
        .forEach(c-> System.out.println(  c ));

 System.out.println( );

    }
}
class TravelCustomer{
    private String name;
    private int age;
    private int  price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
