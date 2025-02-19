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
        salesReps.add(new SalesRep("Sannteen", "Budda", "Marketing", 65));
        salesReps.add(new SalesRep("Collin", "Clarke", "Marketing", 75));
        salesReps.add(new SalesRep("Shanna-Deen", "Knight", "Marketing", 70));
        salesReps.add(new SalesRep("Kemar", "Lemonious", "Marketing", 67));
        salesReps.add(new SalesRep("Gwendolyn", "Byfield", "Marketing", 55));

        //Display Managers information
        System.out.println("\nManager Details:");
        manager_1.display();
        System.out.println("Total Salary$: " + manager_1.calculateSalary());

        //Display Sales Representative Information
        System.out.println("\nSales Representative Details: ");
        for (SalesRep rep : salesReps) {
            rep.display();
            System.out.println("Total Salary$: " + rep.calculateSalary());
        }
        //generate paystub and write to a file
        generatePaystub(manager_1, salesReps);

        public static void generatePaystub(Manager manager_1, ArrayList<SalesRep> salesReps)  {
            try{
                FileWriter writer = new FileWriter("paystub.txt");
                //Managers Details
                writer.write("Manager Details:\n");
                writer.write("Name: " + manager_1.getFirstname() + " " + manager_1.getLastname() + "\n");
                writer.write("Department: " + manager_1.getDeptName() + "\n");
                writer.write("Hours Worked: " + manager_1.getHoursWorked());
                writer.write("Bonus $: " + manager_1.getBonus() + "\n");
                writer.write("Total Salary$: " + manager_1.calculateSalary() + "\n");

                //Sales Representative Details
                writer.write("Sales Representative Details: \n");
                for (SalesRep rep : salesReps) {
                    writer.write("Name: " + rep.getFirstname() + " " + rep.getLastname() + "\n");
                    writer.write("Department: " + rep.getDeptName() + "\n");
                    writer.write("Hours Worked: " + rep.getHoursWorked() + "\n");
                    writer.write("Allowance $: " + rep.getAllowance() + "\n");
                    writer.write("Total Salary $: " + rep.calculateSalary() + "\n");
                }
                //close file
                writer.close();
                System.out.println("\n Pay Stub successfully generated");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
