package day_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud_Operation {

    public static void main(String[] args) {

        selectOption();
        Scanner userInput = new Scanner(System.in);
        List<Fields> emp = new ArrayList<>();

        emp.add(new Fields("ajith", "CEO"));
        emp.add(new Fields("anna", "CMD"));
        emp.add(new Fields("pandiyan", "COO"));
        emp.add(new Fields("kumar", "GM"));

        
        // select your options
        int option = userInput.nextInt();

        if (option == 1) {
            // add data
            System.out.println("enter your new member");

            System.out.println("enter your name");
            String empName = userInput.nextLine();

            System.out.println("enter your role");
            String empRole = userInput.nextLine();

            emp.add(new Fields(empName, empRole));
            System.out.println("success fully edited");

            selectOption();
            userInput.nextInt();
        }

        else if (option == 2) {

            // get all data
            System.out.println("list of all employees");
            for (Fields employee : emp) {
                System.out.println(employee.name + " " + employee.role);
            }

            selectOption();
            userInput.nextInt();
        }

        else if (option == 3) {
            // get particular data
            System.out.println("Get Selected member details");
            System.out.println(" type 'numbers only' ");
            int empNum = userInput.nextInt();
            emp.get((empNum - 1));

            selectOption();
            userInput.nextInt();
        }
        // // edit single data
        // System.out.println("edit n-th particular member");
        // System.out.println("select n-th particular member in list");
        // int editEmpNum = userInput.nextInt();

        // System.out.println("change the name");
        // String editEmpName = userInput.nextLine();

        // System.out.println("change the role");
        // String editEmpRole = userInput.nextLine();
        // emp.set((editEmpNum-1),editEmpName,editEmpRole);
        // System.out.println("success fully edited");

        // remove single data
        else if (option == 4) {
            System.out.println("remove n-th particular member only");
            System.out.println("type 'numbers only'");
            int empRank = userInput.nextInt();
            emp.remove((empRank - 1));
            System.out.println("success fully removed");

            selectOption();
            userInput.nextInt();
        }

        else if (option == 5) {
            // remove all data
            System.out.println("remove all members");
            System.out.println(" type 'true or false only' ");
            boolean clearAll = userInput.nextBoolean();
            if (clearAll == true) {
                emp.clear();
            } else {
                System.out.println("data are safe");
            }

            selectOption();
            userInput.nextInt();
        }

    }

    public static void selectOption() {
            // select your options
        System.out.println("select your options");
        System.out.println("select 1 for insert new data");
        System.out.println("select 2 for get all data");
        System.out.println("select 3 for get particular data");
        System.out.println("select 4 for remove particular data");
        System.out.println("select 5 for remove all data");
    }

}
