package 회원정보;

import java.util.Scanner;

public class MemberInfo {
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.println("이름 : ");
        name = sc.nextLine();

    }

    public void setAge() {
        while (true) {
            System.out.println("나이 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return;
            System.out.println("나이를 잘 못 입력했습니다.");
        }
    }
    public  void setGender(){
        while (true){
            System.out.println("성별 : ");
            gender = sc.next().charAt(0);
            switch (gender){
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default: System.out.println("잘 못 입력했습니다.");
                  }

        }
    }
    public  void setJobs(){
        while (true){
        System.out.println("직업 : ");
        jobs = sc.nextInt();
        if(jobs >0&&jobs<5) break;
    }
    }

    public void  getInfo(){
        String[] genderStr={"","남성","여성"};
        String[] jobStr={"","학생","회사원","주부","무직"};
         System.out.println("=**=".repeat(5)+"회원정보"+"=**=".repeat(5));
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("성별 :" + genderStr[getGenderType()]);
        System.out.println("직업 :" + jobStr[jobs]);




    }

    private int getGenderType() {
        if(gender=='M'||gender=='m') return 1;
        else return 2;
    }

}
