import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;


public class DictionaryManagement {

    public Dictionary dictionary = new Dictionary();

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
        File f = new File("C:\\Users\\Admin\\Downloads\\Nghia\\tudien\\src\\E_V.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            String[] s = line.split("<html>");
            Word c = new Word(s[0],"<html>" + s[1]);
            dictionary.add(c);
        }
        fr.close();
        br.close();
    }

    public Word dictionaryLookup(String s) {

        for (int i = 0; i < dictionary.list.size(); i++) {

            if (dictionary.getWordinList(i).equals(s)) {
                return dictionary.list.get(i);
            }
        }
        return null;
    }

    public void addWord() {


    }

    public void deleteWord() {
        /*Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        dictionary.delete(s1);*/
    }

    public void fixWord(String word) {

       /* Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        dictionary.fix(word, s);*/
    }

    public void dictionaryExportToFile(String word, String mean) throws IOException {
        BufferedWriter bw = null;
        FileWriter fileWriter = null;
        String s = word + "<html><i>" + "" + "</i><br/><ul><li><b><i> " + "" + "</i></b><ul><li><font color='#cc0000'><b> " + mean + "</b></font></li></ul></li></ul></html>\n";
        File file = new File("C:\\Users\\Admin\\Downloads\\Nghia\\tudien\\src\\E_V.txt");
        fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fileWriter);
        bw.write(s);
        insertFromFile();
    }




}