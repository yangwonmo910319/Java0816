package 전자레인지;

public class Ex2 {
    public static void main(String[] args) {
        int i=10;
        System.out.println("10");
        while(true){
            if(i<11) {
                System.out.println("9");

            }
            if(i%2==0) {
                System.out.println("8");

               while (true){
                    System.out.println("7");
                    break;
          }break;
            }
            System.out.println("3");
        }
    }
}
