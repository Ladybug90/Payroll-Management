/*
Sannteen Budda 2017001936
Shanna-Deen Knight 2301010612
Kemar Lemonious 1300036191
Collin Clarke 2301010852
*/
package Payroll_System;

public class Manager extends StaffMember {
    private double bonus;

    //constructor
    public Manager(String fname, String lname, String dptname, double hrswrk, double bnus) {
        //use "Super" keyword to call the constructor from the Parent class
        super(fname, lname, dptname, hrswrk);
        this.bonus = bnus;
        }
        @Override
        public double calculateSalary() {
            return (this.hoursWorked * 2500) + this.bonus;
        }
        @Override
        public void display() {
            System.out.println("Staff: " + this.getClass().getName());
            super.display();
            System.out.println("Bonus$: \t\t\t" + this.bonus);
            System.out.println("Total Salary: \t\t" + "$"+String.format("%.2f", calculateSalary()));
        }

        public double getBonus () {
            return bonus;
        }
        public void setBonus(double bonus){
            this.bonus = bonus;
        }

}

