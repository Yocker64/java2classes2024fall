/**
 * sort
 */
import java.util.Scanner;
public class sort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("英単語をカンマ区切りで入力してください。");
        String[] words = scan.nextLine().split(" ");
        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words.length-1; j++) {
                if (words[j].compareTo(words[j+1])>0) {
                    String tmp = words[j];
                    words[j]=words[j+1];
                    words[j+1]=tmp;
                }
            }
        }
            
System.out.println("辞書順でソートしました。");
    for (String string : words) {
        System.out.println(string);

    }
    scan.close();
    }
}