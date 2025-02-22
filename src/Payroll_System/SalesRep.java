package Payroll_System;

public class SalesRep extends StaffMember{  //Extends keyword is used when a class is inheriting from a super class
    private double allowance;

    //Constructor
    public SalesRep (String fname, String lname, String dptname, double hrswrk){
        //use "Super" keyword to call the constructor from the Parent class
        super (fname, lname, dptname, hrswrk );
        this.allowance = calculateAllowance(); //"this" keyword refers to current object or method in the constructor
    }
    @Override
    public double calculateSalary() {
        return (hoursWorked * 1500) + allowance;
    }

    //allowance is 5% of salary
    public double calculateAllowance() {
        return (hoursWorked * 1500)*0.1;
    }

    @Override
    public void display(){
        System.out.println("Staff: " + this.getClass().getName());
        super.display();
        System.out.println("Allowance$: \t\t" + this.allowance);
        System.out.println("Total Salary: \t\t" +"$" + String.format("%.2f", calculateSalary()));
    }

    public double getAllowance() {
        return allowance;
    }

}

