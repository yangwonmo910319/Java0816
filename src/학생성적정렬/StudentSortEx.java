package 학생성적정렬;

import 리스트.CarComp;

import java.util.Iterator;
import java.util.TreeSet;

//5명 이름 성적 -> 성적 높은순 -> 이름순
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<Student>();
        students.add(new Student("11", 40));
        students.add(new Student("1111", 20));
        students.add(new Student("11", 70));
        students.add(new Student("11", 60));
        students.add(new Student("111", 50));
/*        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()) {
            Student std = iterator.next();

            System.out.println(std.name+std.score);
        }*/
        for (Student e : students) {
            System.out.println(e.name + ":" + e.score);


        }
    }
}
