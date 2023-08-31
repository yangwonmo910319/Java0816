package 단어정렬;

import java.util.Comparator;

public class WordComparator  implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        if(o1.ss > o2.ss)  {
            return 1;

        }        else if(o1.ss == o2.ss){
            if(o1.s.length()>o2.s.length()){
                return 1;
            }
        }

        return -1;

        }


}
