package task07;

public class Student {
    String name;
    int id;
    static int serial=0;

     Student(String name) {
        this.name = name;
        id = ++serial;
    }

     Student(){
        this("名無し");
    }
      void greet(){
        this.greet("");

    }
    public  void greet(String hola){
        System.out.println(id+"番の"+ name+"です、"+hola);

    }
      void greet(Student stud){
        System.out.println(stud.id+"番の"+ stud.name+"さん");

    }


}
