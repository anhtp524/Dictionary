import java.util.ArrayList;

public class Dictionary {
     public ArrayList<Word> list = new ArrayList<Word>();

     public void add(Word a) {
         list.add(a);
     }

    public void delete(Word a) {
         list.remove(a);
    }




}

