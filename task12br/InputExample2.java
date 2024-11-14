package task12br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample2 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean bool = true;
        while (bool) {
            System.out.println("数を入力してください。");
            try {
                String line = br.readLine();
                 
                System.out.println("入力された値の平方根は，" + Math.sqrt(Double.parseDouble(line)) + "です");
                bool = false;
    
            } catch (IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e) {
                System.out.println("NumberFormatExceptionが投げられました。");
                System.out.println(e);
            }
    
        }
        }
        
}
