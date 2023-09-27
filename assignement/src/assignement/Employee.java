/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignement;

/**
 *
 * @author lubna
 */
public class Employee implements Comparable <Employee> {
    int x = 10;
    private int empNo;
    private String name;
    private double payRatePerHour;
    private PaySheet[] paySheetFor4Weeks = new PaySheet[4];
    private String jopTitle;
    private String department;

    public Employee(int empNo, String name, double payRatePerHour, String jopTitle, String department) {
        this.empNo = empNo;
        this.name = name;
        this.payRatePerHour = payRatePerHour;
        this.jopTitle = jopTitle;
        this.department = department;
    }

    public void setJopTitle(String jopTitle) {
        this.jopTitle = jopTitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJopTitle() {
        return jopTitle;
    }

    public String getDepartment() {
        return department;
    }
    public Employee(int empNo, String name, double payRatePerHour) {
        this.empNo = empNo;
        this.name = name;
        this.payRatePerHour = payRatePerHour;
    }

    public Employee() {
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayRatePerHour(double payRatePerHour) {
        this.payRatePerHour = payRatePerHour;
    }

    public void setPaySheetFor4Weeks(PaySheet[] paySheetFor4Weeks) {
        this.paySheetFor4Weeks = paySheetFor4Weeks;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public double getPayRatePerHour() {
        return payRatePerHour;
    }

    public PaySheet[] getPaySheetFor4Weeks() {
        return paySheetFor4Weeks;
    }

    public Employee(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public int getTotalPayment() {
        int x = 0;
        for (int i = 0; i < paySheetFor4Weeks.length; i++) {
            x+=paySheetFor4Weeks[i].getTotalHours()*payRatePerHour;
        }
        return x;
    }
    public boolean hasBeenWarned(){
        boolean x = false;
        for (int i = 0; i < paySheetFor4Weeks.length-1; i++) {
            if(paySheetFor4Weeks[i].getTotalAbsences()+paySheetFor4Weeks[i+1].getTotalAbsences()>=2)
                x=true;
        }
        return x;
    }

    @Override
    public String toString() {
        return "Employee{" + "empNo=" + empNo + ", name=" + name + ", payRatePerHour=" + payRatePerHour + ", paySheetFor4Weeks=" + paySheetFor4Weeks + ", jopTitle=" + jopTitle + ", department=" + department + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getTotalPayment()- o.getTotalPayment();
        }
    
    
}
