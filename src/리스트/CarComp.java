package 리스트;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        System.out.println(  "1 객체 생성" );
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    //반환값이 1이면  변경 조건에 해당
    //반환값이 -1이면 조건이 아님
//반환값이 0 정렬 조건은 아니지만 set을 사용하는 경우 중복제거 조건이 됨
    public int compareTo(CarComp o) {
        System.out.println(  "2 객체 생성 후 비교" );
        System.out.println("새 객체" +modelName );
        System.out.println(o.modelName );
        if (this.modelYear > o.modelYear) {
            System.out.println("변경");
            return 1;//오름차순 정렬
        }else {System.out.println("변경 X" );return -1;}
    }
}

