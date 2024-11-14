package task12br;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        File file = new File("task12/files/FileWriterExample.txt");
        try (FileWriter fr = new FileWriter(file)) {
            BufferedWriter bw = new BufferedWriter(fr);
            for (int i = 0; i < 10; i++) {
                bw.write("[" + i + "]\n");
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
    }
}
