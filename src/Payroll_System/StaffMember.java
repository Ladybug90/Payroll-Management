/*
Sannteen Budda 2017001936
Shanna-Deen Knight 2301010612
Kemar Lemonious 1300036191
Collin Clarke 2301010852
*/

package Payroll_System;


public abstract class StaffMember {
    private String firstname;
    private String lastname;
    private String deptName;
    protected double hoursWorked;


    // Constructor
    public StaffMember (String fname, String lname, String dptname, double hrswrk){
        this.firstname = fname;
        this.lastname = lname;
        this.deptName = dptname;
        this.hoursWorked = hrswrk;

    }
    public abstract double calculateSalary();

    public void display () {
        System.out.println("Name: \t\t\t\t" + this.firstname + "  " + this.lastname);
        System.out.println("Department Name: \t" + this.deptName);
        System.out.println("Hours Worked: \t\t" + this.hoursWorked);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

