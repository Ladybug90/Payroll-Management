package Payroll_System;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args) {
        //Instantiate Manager
        Manager manager_1 = new Manager ("Crystal", "King", "AdminManager", 55, 90000);

        //List of Sales Representative
        ArrayList<SalesRep> salesReps = new ArrayList<>();
        salesReps.add(new SalesRep("Jane", "Doe", "Marketing", 65));
        salesReps.add(new SalesRep("Clarke", "Kent", "Marketing", 75));
        salesReps.add(new SalesRep("John", "Wick", "Marketing", 70));
        salesReps.add(new SalesRep("Tony", "Stark", "Marketing", 67));
        salesReps.add(new SalesRep("Gwendolyn", "Johnson", "Marketing", 55));

        //Display Managers information
        System.out.println("\n******* Manager Details *******\n");
        manager_1.display();
        //System.out.println("Total Salary$: " + manager_1.calculateSalary());

        //Display Sales Representative Information
        for (SalesRep rep : salesReps) {
            System.out.println("\n******* Sales Representative Details ******* \n");
            rep.display();
            //System.out.println("Total Salary$: " + rep.calculateSalary());
        }
        //generate paystub and write to a file
        generatePaystub(manager_1, salesReps);

    }
    public static void generatePaystub(Manager manager_1, ArrayList<SalesRep> salesReps)  {
        try{
            FileWriter writer = new FileWriter("paystub.txt");
            writer.write("Staff Pay slip Details\n\n");
            //Managers Details
            writer.write("******* Manager *******\n");
            writer.write("Name: \t\t" + manager_1.getFirstname() + " " + manager_1.getLastname() + "\n");
            writer.write("Department: \t" + manager_1.getDeptName() + "\n");
            writer.write("Hours Worked: \t" + manager_1.getHoursWorked()+ "\n");
            writer.write("Bonus: \t\t" + "$"+manager_1.getBonus() + "\n");
            writer.write("Total Salary: \t" + "$"+manager_1.calculateSalary() + "\n");

            //Sales Representative Details

            for (SalesRep rep : salesReps) {
                writer.write("\n******* Sales Representative ******* \n");
                writer.write("Name: \t\t\t" + rep.getFirstname() + " " + rep.getLastname() + "\n");
                writer.write("Department: \t\t" + rep.getDeptName() + "\n");
                writer.write("Hours Worked: \t\t" + rep.getHoursWorked() + "\n");
                writer.write("Allowance: \t\t" + "$"+rep.getAllowance() + "\n");
                writer.write("Total Salary: \t\t" + "$"+rep.calculateSalary() + "\n");
            }

            //close file
            writer.close();
            System.out.println("\n Pay Stub successfully generated");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}