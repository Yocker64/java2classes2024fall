package task12br;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("task12/files/FileWriterExample.txt")));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s + "を読み込みました。");
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
