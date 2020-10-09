import java.util.*;
import java.io.*;

public class DictionaryManagement {
    public Scanner sc = new Scanner(System.in);
     Dictionary dictionary = new Dictionary();
    public void  insertFromCommandline() {
        int n = sc.nextInt();
        Dictionary dictionary = new Dictionary();
        for(int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Word w = new Word(s1, s2);
            dictionary.add(w);
        }
    }



}
