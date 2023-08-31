package 학생성적정렬;

public class Student implements  Comparable<Student> {
   int name;
  int score;

    public Student(int name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
/*
        if(this.score>o.score){
            return 1;//점수 뒤에 가 높으면 바꿈
        }
        else {
           if(  this.score==o.score){
               return this.name.compareTo(o.name);
               if(this.name.compareTo(o.name==!);
           }return -1;
        }
*/

        if(this.name>o.name){//이름 길이

            return 1;
        }
        if(this.name==o.name){

            if(this.score>o.score){
                return 1;//점수 뒤에 가 높으면 바꿈
            }
            return -1;
        }
        else {

             return -1;
         }
        }



    }


