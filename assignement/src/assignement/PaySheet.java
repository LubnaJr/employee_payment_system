/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignement;

/**
 *
 * @author lubna
 */
public class PaySheet {

    private String weekEndingDate;
    private int[] workHours = new int[5];

    public void setWorkHours(int[] workHours) {
        this.workHours = workHours;
    }

    public PaySheet() {
    }

    public PaySheet(String weekEndingDate) {
        this.weekEndingDate = weekEndingDate;
    }

    public  String getWeekEndingDate() {
        return this.weekEndingDate;
    }

    public int[] getWorkHours() {
        return workHours;
    }
   public int getTotalHours(){
       int x= 0;
       for (int i = 0; i <workHours.length ; i++) {
           x+=workHours[i];
       }
       return x;
   }
   public int getTotalDays(){
       int x = 0;
       for (int i = 0; i < workHours.length; i++) {
           if(workHours[i]>0)
           x++;
       }
       return x;
   }
   public int getTotalAbsences(){
       int x = 0;
       for (int i = 0; i < workHours.length; i++) {
           if(workHours[i]==0)
           x++;
       }
       return x;
   }
   public  double getTotalPay(double payRatePerHour){
       
      return getTotalHours() * payRatePerHour;
           
       }
   
}
