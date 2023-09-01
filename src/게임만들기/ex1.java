package 게임만들기;

public class ex1 {
    public static void main(String[] args) {
        int[] a= {1,2};
        try {
            System.out.println(   a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
     System.out.println(   e.getMessage());
     System.out.println(   e);
        }finally {
            System.out.print(   "ffff");
        }

    }
}
