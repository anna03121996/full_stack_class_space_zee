package day_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud_Operation{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        List<Fields> emp = new ArrayList<>();

        emp.add(new Fields("ajith", "CEO"));
        emp.add(new Fields("anna", "CMD"));
        emp.add(new Fields("pandiyan", "COO"));
        emp.add(new Fields("kumar", "GM"));

        // select your options
        System.out.println("select your options");
        System.out.println("select your options");
        int option = myObj.nextInt();

        if(option == 1){}

        // add data
        System.out.println("enter your new member");

        System.out.println("enter your name");
        String empName = myObj.nextLine();

        System.out.println("enter your role");
        String empRole = myObj.nextLine();

        emp.add(new Fields(empName,empRole));

        // get all data
        System.out.println("list of all employees");
        for(Fields employee : emp){
            System.out.println(employee.name + " " + employee.role);
        }
        
        // get particular data
        System.out.println("Get Selected member details");
        System.out.println(" type 'numbers only' ");
        int empNum = myObj.nextInt();
        emp.get((empNum-1));

        // remove single data
        System.out.println("remove n-th particular member only");
        System.out.println("type 'numbers only'");
        int empRank = myObj.nextInt();
        emp.remove((empRank-1));

        // remove all data
        System.out.println("remove all members");
        System.out.println(" type 'true or false only' ");
        boolean clearAll = myObj.nextBoolean();
        if(clearAll == true){
            emp.clear();
        }
        else{
            System.out.println("data are safe");
        }

    }
        
}
