import java.util.Scanner;
public class DictionaryManagement {
    static Scanner sc = new Scanner(System.in);
    public static void  insertFromCommandline() {
        int n = sc.nextInt();
        Word[] in = new Word[n];
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            in[i].setWord(s);
            s = sc.nextLine();
            in[i].setMean(s);
        }
    }

    public static void main(String[] args) {
        insertFromCommandline();
    }
}
