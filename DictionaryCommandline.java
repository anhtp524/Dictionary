import java.util.Scanner;

public class DictionaryCommandline {
    static DictionaryManagement myDictionary = new DictionaryManagement();
    public static void showAllWords() {
        System.out.println("No | English | Vietnamese");
        int n = myDictionary.dictionary.size();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + myDictionary.dictionary.getWordinList(i) +
                                " | " + myDictionary.dictionary.getMeaninList(i));
        }
    }

    public static void dictionaryBasic() {
        myDictionary.insertFromCommandline();
        showAllWords();
    }



}
