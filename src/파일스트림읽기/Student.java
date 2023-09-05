package 파일스트림읽기;

public class Student  implements  Comparable<Student>{
String name;
        int total;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotal()==o.getTotal()) return this.name.compareTo((o.name));

        return    o.getTotal()-this.getTotal();
        // 뒤에 크면 1  앞이크면 -1
    }
}
