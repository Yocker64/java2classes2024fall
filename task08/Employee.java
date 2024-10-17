package task08;

public class Employee {
    int ID;
    static int serial;
    String name;
    //Employee constructor
    public Employee( String name) {
        ID = serial;
        this.name = name;
        serial++;
    }
    
    //methods
    void greet(){
        System.out.println("いらっしゃいませー");

    }
    void list(){
        System.out.println("IDは： " + this.ID+"\n 氏名：　"+this.name);
    }

}
