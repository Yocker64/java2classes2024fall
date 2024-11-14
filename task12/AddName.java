package task12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddName {
    public static void main(String[] args) {
        try {
            File file = new File("task.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            System.out.println("登録する名前を入力してください。");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(in);
            String name = reader.readLine();
            while (!name.equals("x")) {
                bw.write(name + "\r\n");
                System.out.println(name + "さんを登録しました。");
                System.out.println("登録を続ける場合は続けて名前を入れてください。終了する場合はx（小文字）");
                name = reader.readLine();
            }
            bw.close();
            System.out.println("出力しました。" + file + "を確認してください。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
