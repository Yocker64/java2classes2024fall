import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        
        char[] character = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
            Scanner scan = new Scanner(System.in);
            System.out.println("８以上３２以下の数を入力してください");
            int lenghtz = scan.nextInt();
            if (lenghtz<8|| 32<lenghtz) {
                System.out.println("パスワードは８以上３２以下でなければなりません。");
            }
            String password="";
            for (int i = 0; i < lenghtz; i++) {
                int target = (int) (Math.random() * character.length+ 1);
                password+=character[target];
            }
            System.out.println(password);
            scan.close();
    }
}
