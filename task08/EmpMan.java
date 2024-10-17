package task08;

/**
 * EmpMan
 */
public class EmpMan {

    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        employees[0] = new FullTimer("ダウちん");
        employees[1] = new PartTimer("バットくん");
        employees[2] = new FullTimer("イヴァン殿");
        employees[3] = new FullTimer("ダニちゃん");
        employees[4] = new PartTimer("ヘダキュン");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            employees[i].list();
            System.out.println("挨拶：");
            employees[i].greet();
            System.out.println("----------------------------");
        }
    }
}