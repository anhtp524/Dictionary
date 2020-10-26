import java.util.ArrayList;

public class Dictionary {
     private ArrayList<Word> list = new ArrayList<>();
     private int count = 0;

     public void add(Word a) {
         list.add(a);
         count ++;
     }

    public void delete(String a) {
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWord().equals(a)) {
                list.remove(i);
                count --;
            }
         }

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

    public void fix(String word, String input) {
         for (int i = 0; i < list.size(); i++) {
             if(getWordinList(i).equals(word) == true) {
                 list.get(i).setMean(input);
             }
         }
    }
}

