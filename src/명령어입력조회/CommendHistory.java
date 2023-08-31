package 명령어입력조회;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class CommendHistory {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
         CommendHistory history = new CommendHistory();
  System.out.println(  "help를 입력하면 도움말을 볼 수 있습니다." );
    while (true){
         System.out.println( "$"  );
        Scanner scanner = new Scanner(System.in);
          String cmd= scanner.nextLine().trim();
          if(cmd.equalsIgnoreCase("q")){
              System.exit(0);//프로그램 종료
          }else if(cmd.equalsIgnoreCase("help")){
               System.out.println( "help 도움말을 보여 줍니다"  );
               System.out.println( "q/Q/ 프로그램 종료" );
               System.out.println( "hisroty 최근 입력힌 명령어를"+ MAX_SIZE+ "개 버여줍니다.");

          }else  if(cmd.equalsIgnoreCase("history")){
              history.save(cmd);
              int cnt=0;
              for(String e: history.queue){
                  cnt++;
                   System.out.println(  cnt+" " +e);
              }
          }else {
              history.save(cmd);
               System.out.println(cmd   );
          }
    }



    }
    void save(String cmd){
        queue.offer(cmd);
        if(queue.size()>MAX_SIZE)
            if(queue.size() > MAX_SIZE) queue.remove();
    }
}

