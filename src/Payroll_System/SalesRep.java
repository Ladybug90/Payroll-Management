package Payroll_System;

public class SalesRep extends StaffMember{  //Extends keyword is used when a class is inheriting from a super class
    private double allowance;

    //Constructor
    public SalesRep (String fname, String lname, String dptname, double hrswrk, double allwnce){
        //use "Super" keyword to call the constructor from the Parent class
        super (fname, lname, dptname, hrswrk );
        this.allowance = allwnce; //"this" keyword refers to current object or method in the constructor
    }
    @Override
    public double calculateSalary() {
        return (hoursWorked * 1500) + allowance;
    }

    @Override
    public void display(){
        System.out.println("Staff: " + this.getClass().getName());
        super.display();
        System.out.println("Allowance$: " + this.allowance);
        System.out.println("Total Salary $: " + calculateSalary());
    }

    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }


}

