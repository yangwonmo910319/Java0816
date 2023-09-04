package 직렬화연습;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
    private  int bro;
     public  String title;

     private String content;
     private String write;
     private Date date;

    public int getBro() {
        return bro;
    }

    public void setBro(int bro) {
        this.bro = bro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Board(int bro, String title, String content, String write, Date date) {
        this.bro = bro;
        this.title = title;
        this.content = content;
        this.write = write;
        this.date = date;
    }
}
