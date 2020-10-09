import java.util.ArrayList;

public class Dictionary {
     private ArrayList<Word> list = new ArrayList<>();
     private int count = 0;

     public void add(Word a) {
         list.add(a);
         count ++;
     }

    public void delete(Word a) {
         list.remove(a);
         count --;
    }

    public int size() {
         return count;
    }

    public String getWordinList(int n) {
         return list.get(n).getWord();
    }

    public String getMeaninList(int n) {
         return list.get(n).getMean();
    }

    




}

