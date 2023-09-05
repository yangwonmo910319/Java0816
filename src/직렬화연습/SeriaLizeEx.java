package 직렬화연습;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.SimpleFormatter;

//직렬화 : 객체를 출력하기 위해서는 일렬로 연속적인 바이트로 변경
public class SeriaLizeEx {
    public static void main(String[] args) {
        writeList();
List<Board> list  = readList();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd");
        for(Board b : list){
             System.out.printf("%d%s%s%s%s \n",b.getBro(),b.getTitle(),b.getContent(),b.getWrite(),sdf.format(b.getDate()));
        }
    }

    public static void writeList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "C++", "고성능언어", "우영우", new Date()));
        list.add(new Board(2, "java", "객체지향언어", "동그라미", new Date()));
        list.add(new Board(3, "C", "간결한언어", "이준호", new Date()));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("board.xxb");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (IOException e) {

        }


    }

    public static List<Board> readList() {
        try {
            FileInputStream fis = new FileInputStream("board.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Board> list = (List<Board>) ois.readObject();
return  list;

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }return null;
    }
}
