package task12br;

import java.io.*;

public class InputExample {
    public static void main(String[] args) {
        System.out.println("あなたのお名前は？ ");
         //We are creating a buffered reader that acts almost the same way as a scanner except that this one does
         //not parse the input, it only reads text, so if you want some particular primitive data type you have to parse it
         //In order to create a buffered reader you need a input stream reader which can be a lot of ways, one of those 
         // and the most common is the 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            System.out.println("こんにちは。" + name + "さん");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}