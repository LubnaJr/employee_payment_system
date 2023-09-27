/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignement;

import java.util.*;

/**
 *
 * @author lubna
 */
public class Main {

   
    public static void main(String[] args) {
        Employee a= new Employee(1,"ali",12.5);
        Employee b= new Employee(2,"Amad",18.5);
                Employee k= new Employee(2,"Ahmad",18.5);
        Employee j= new Employee(2,"Ahmad",18.5);
        Employee l= new Employee(2,"Ahad",18.5);

        PaySheet sh1[]={new PaySheet(),new PaySheet(),new PaySheet(),new PaySheet()};
        PaySheet sh2[]={new PaySheet(),new PaySheet(),new PaySheet(),new PaySheet()};
        int x[][]={{8,8,8,8,0},{8,8,8,7,2},{4,0,3,4,5},{1,2,3,4,5}};
        int y[][]={{0,0,8,0,0},{4,2,4,4,0},{0,0,3,4,5},{1,8,2,4,5}};

        for (int i = 0; i < x.length; i++) {
            sh1[i].setWorkHours(x[i]);
        }
        for (int i = 0; i < y.length; i++) {
            sh2[i].setWorkHours(y[i]);
        }
        a.setPaySheetFor4Weeks(sh1);
        b.setPaySheetFor4Weeks(sh2);
        Employee emps[]={a,b,k,j,l};
//        printWarnedEmployees(emps);
//        printInfo(emps);
//       sortEmps(emps);
//System.out.println(m(emps));
    Employee z[] = new Employee[3];
  System.out.println(z[0].x);
    }

 private static void printWarnedEmployees(Employee[] emps) {
    System.out.println("\n---------Lubna Jaradat----------");
        System.out.println("---------202210149----------\n");

     for (int i = 0; i < emps.length; i++) {
         if(emps[i].hasBeenWarned())
             System.out.println(emps[i].getName());
     }
    }

private static void printInfo(Employee[] emp) {
    System.out.println("\n---------Lubna Jaradat----------");
            System.out.println("---------202210149----------\n");

    System.out.println("Emp NO\tweek\tTotal Days/Hours    Weekly payment");
    for (int i = 0; i < emp.length; i++) {
        for (int j = 0; j <emp[i].getPaySheetFor4Weeks().length; j++) {
           PaySheet a = emp[i].getPaySheetFor4Weeks()[j];
           double totalPay = a.getTotalHours()*emp[i].getPayRatePerHour();
           System.out.printf("  %d\t  %d\t  %d/%d\t\t     %.2f\n",emp[i].getEmpNo(),j+1,a.getTotalDays(),a.getTotalHours(),totalPay);

        }
    }}
    public static void sortEmps(Object[] o){
      System.out.println("\n---------Lubna Jaradat----------");
              System.out.println("---------202210149----------\n");

        ArrayList <Employee> a = new ArrayList <Employee>();
        for (int i = 0; i < o.length; i++) {
            if(o[i] instanceof Employee){
            if(!((Employee)o[i]).hasBeenWarned())
                a.add((Employee)o[i]);
            }
        }
                Collections.sort(a);
                 for (int i = 0; i < a.size(); i++) {
                     System.out.println(a.get(i).getName());
            
        }
    }
public static int m(Employee a[]){
    String prev = "",curr="";
    int c = 0;
    for (int i = 0; i < a.length; i++) {
       prev = curr;
       curr = a[i].getName();
        if(!prev.equals(curr)) {
            for (int j = i; j < a.length; j++) {
               if(a[j].getName().equals(curr))
                   c++;
                
            }
            if(c>=3)
                return 2020;
            else if(a.length-c<3)
                return -1;
            c=0;
        }
    }
    return -1;
}    
}
    

