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
        File f = new File("C:\\Users\\Admin\\IdeaProjects\\Từ Điển\\test");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            String[] s = line.split("\n");
            Word c = new Word(s[0],s[1]);
            dictionary.add(c);
        }
        fr.close();
        br.close();
    }

    public void dictionaryLookup() throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if (s1.equals(dictionary.getWordinList(i))) {
                System.out.println(dictionary.getMeaninList(i));
                break;
            }
        }
    }

    public void addWord() throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = sc.nextInt();
        Word w = new Word(s1, s2);
        dictionary.add(w);
    }

    public void removeWord() throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(dictionary.getWordinList(i).equals(s1) && dictionary.getMeaninList(i).equals(s2)) {
                for(int j = i; j < n - 1; j++) {
                    dictionary.getWordinList(j).equals(dictionary.getWordinList(j+1));
                    dictionary.getMeaninList(j).equals(dictionary.getMeaninList(j+1));
                }
            }
            Word w = new Word(s1, s2);
            dictionary.delete(w);
        }
    }

    public void fixWord() throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(dictionary.getWordinList(i).equals(s1) && dictionary.getMeaninList(i).equals(s2)) {
                dictionary.getWordinList(i).equals(s3);
                dictionary.getMeaninList(i).equals(s4);
            }
        }
    }




}
