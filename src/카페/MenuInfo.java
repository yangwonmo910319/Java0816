package 카페;

import java.io.Serializable;

public class MenuInfo implements Serializable {
   private String name;
    private int price;
    private String category;
    private String descrition;

    public MenuInfo(String name, int price, String category, String descrition) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.descrition = descrition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }
}
