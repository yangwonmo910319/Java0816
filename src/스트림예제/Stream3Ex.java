package 스트림예제;

import java.util.Arrays;
import java.util.List;

public class Stream3Ex {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(
                new Student("강",21),
                new Student("중",32),
                new Student("하",53),
                new Student("아",64),
                new Student("가",58)
        );
        double avg=list.stream()
                        .mapToInt(Student::getScore)
                .average().getAsDouble();
        System.out.println("평균"+avg);
        int sum=list.stream()
                .mapToInt(Student::getScore)
                        .sum();
        System.out.println("합"+sum);
        list.stream().forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+"---name");
            System.out.println(score+"---score");
        });
        for(Student s : list){
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+"---name");
            System.out.println(score+"---score");
        }
        list.parallelStream().forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+"---name");
            System.out.println(score+"---score");
        });
    }
}
class Student{
    private String name;
    private  int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
