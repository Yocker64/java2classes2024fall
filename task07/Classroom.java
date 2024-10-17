package task07;

public class Classroom {
    static void howMany(){
        System.out.println("現在の学生数は"+ Student.serial+"人です。");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Batt");
        Student s2 = new Student("Ivan");
        Student s3 = new Student("Dau");
        Student s4 = new Student("Dimitri");
        Student s5 = new Student();
        s1.greet();
        s1.greet("よろしく");
        s1.greet(s2);
        s1.greet(s3);
        s1.greet(s5);
        s2.greet();
        s2.greet(s1);
        s2.greet(s3);
        s3.greet("はじめまして");
        howMany();
    
        


    }
}
