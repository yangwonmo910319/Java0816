package 리스트;

public class MenuInfo {
    String name = "";
    int price;
    String category = "";
    String desc = "";
    boolean isTax;

    MenuInfo(String name, int price, boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }

    public String getJsonFormat() {
        return "{" + "\"name\":" + name + "," + "\"price\":" + price + "," + "\"isTax\":" + isTax + "}";
    }
}
