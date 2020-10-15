import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;


public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();

    public void  insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dictionary dictionary = new Dictionary();
        for(int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Word w = new Word(s1, s2);
            dictionary.add(w);
        }
    }

    public void insertFromFile() throws IOException {
        File f = new File("C:\\Users\\anhtp\\IdeaProjects\\Dictionary\\dictionary.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            String[] s = line.split("\t");
            Word c = new Word(s[0],s[1]);
            dictionary.add(c);
        }
        fr.close();
        br.close();
    }





}
