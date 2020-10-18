import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline {
    static DictionaryManagement myDictionary = new DictionaryManagement();

    public static void showAllWords() throws IOException {
        myDictionary.insertFromFile();
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
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        int n = myDictionary.dictionary.size();
        int m = s1.length();
        for (int i = 0; i < n; i++) {
            String s2 = myDictionary.dictionary.getWordinList(i);
            if (compare(s1, s2)) {
                System.out.print(s2 + ", ");
            }
        }

    }

    public static boolean compare(String s1, String s2) {
        int n = s1.length();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                dem++;
            }
        }
        if (dem == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        dictionarySearcher();
        //dictionaryAdvanced();
        //showAllWords();
    }
}