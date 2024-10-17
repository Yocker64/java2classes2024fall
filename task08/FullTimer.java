package task08;

public class FullTimer extends Employee{
    FullTimer(String name){
    super(name);
    }
    void greet(){
    System.out.println("まいどおおきに");
    }
    void list(){
    System.out.println("正社員");
    super.list();
    }
    }