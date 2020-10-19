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

<<<<<<< HEAD
<<<<<<< HEAD
    public static void dictionarySearcher() throws IOException {
        myDictionary.insertFromFile();
        showAllWords();
        Scanner sc = new Scanner(System.in);
        String keyWord = sc.nextLine();
        int count = 0;
        for(int i = 0; i < myDictionary.dictionary.size(); i++) {
            if (testString(keyWord, myDictionary.dictionary.getWordinList(i))) {
                System.out.println(myDictionary.dictionary.getWordinList(i));
=======
=======
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
    public static boolean compare(String s1, String s2) {
        int n = s1.length();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                dem++;
<<<<<<< HEAD
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
=======
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
            }
            else count++;
        }
<<<<<<< HEAD
        if(count == myDictionary.dictionary.size()) System.out.println("No word in Dictionary");
    }

    public static boolean testString(String s1, String s2) {
        int n = s1.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                count++;
            }
        }
<<<<<<< HEAD
        if (count == n) return true;
        else return false;
=======
=======
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
        if (dem == n) {
            return true;
        } else {
            return false;
        }
<<<<<<< HEAD
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
=======
>>>>>>> 8c847689d23191f2e0ae923bfb289be050ff1b4d
    }

    public static void main(String[] args) throws IOException {
        dictionarySearcher();
        //dictionaryAdvanced();
        //showAllWords();
    }
}