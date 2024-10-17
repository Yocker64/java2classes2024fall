package task08;

public class PartTimer extends Employee{
    PartTimer(String name){
        super(name);
    }
    void greet(){
        super.greet();
        System.out.println("こんにちは");
    }
    void list(){
        System.out.println("アルバイトです。");
        super.list();
    }
}
