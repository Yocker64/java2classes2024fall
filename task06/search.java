package task06;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        
        Student s1 = new Student(11, "Ivan");
        Student s2 = new Student(22, "Dau");
        Student s3 = new Student(33, "Bat");
        Student s4 = new Student(44, "Don Jeda");
        Student s5 = new Student(55, "Dimitri");
        Student[] studs = {s1,s2,s3,s4,s5};

        System.out.println("氏名を検索したい学生の学籍番号を入力してください。");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        int exist=0;
        for (int i = 0; i < studs.length; i++) {
            if (id == studs[i].ID) {
                System.out.println(studs[i].name+"は"+ id +"の学籍番号を持っています。");
            }else{
                exist++;
            }
        }
        if (exist==studs.length) {
            System.out.println("その学籍番号を持っている学生は存在しません。");
        }
        
        
    }

}
