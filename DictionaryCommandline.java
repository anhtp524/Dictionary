import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline {
    static DictionaryManagement myDictionary = new DictionaryManagement();
    public static void showAllWords() throws IOException {

        System.out.println("No | English | Vietnamese");
        int n = myDictionary.dictionary.size();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + myDictionary.dictionary.getWordinList(i) +
                                " | " + myDictionary.dictionary.getMeaninList(i));
        }
    }

    public static void dictionaryBasic() throws IOException {
        myDictionary.insertFromCommandline();
        showAllWords();
    }

    public static void dictionaryAdvanced() throws IOException {
        myDictionary.insertFromFile();
        showAllWords();
        myDictionary.dictionaryLookup();
    }



    public static void dictionarySearcher() throws IOException {
        myDictionary.insertFromFile();
        Scanner sc = new Scanner(System.in);
        String keyWord = sc.nextLine();
        for(int i = 0; i < myDictionary.dictionary.size(); i++) {
            if (myDictionary.dictionary.getWordinList(i).contains(keyWord)) {
                System.out.println(myDictionary.dictionary.getWordinList(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        dictionarySearcher();
        //dictionaryAdvanced();
        //showAllWords();
    }
 

}
