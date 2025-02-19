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
    abstract double calculateSalary();

    public void display () {
        System.out.println("Name: " + this.firstname + "  " + this.lastname);
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Hours Worked: " + this.hoursWorked);
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

