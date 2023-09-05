package 파일스트림읽기;

import 직렬화연습.Board;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FileStreamRead {
    public static void main(String[] args) throws FileNotFoundException {
        //정렬 하기 위한
        TreeSet<Student> treeSet =new TreeSet<>();
        //텍스트 파일 읽어오기
        FileInputStream fis = new FileInputStream("src/파일스트림읽기/tst.txt");
        //한줄씩 넣기
        Scanner sc=new Scanner(fis);
        while (sc.hasNextLine()){
            // 스페이스바 기준으로 배열에 넣기
            String[] list= sc.nextLine().split(" ");
             System.out.println(   list[0]);
            treeSet.add(new Student(list[0],Integer.parseInt(list[1])+Integer.parseInt(list[2])));

        }

    }

}
//읽을 클래스
