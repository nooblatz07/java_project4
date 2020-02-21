import java.text.*;
public class Employee{
   DecimalFormat df = new DecimalFormat("0.00");
   //Activity no. 1
   private int empNum;
   private String lname;
   private String fname;
   private char middleInitial;
   private char employeeStatus;
   private char employmentStatus;
   private double hoursWorked;
   //Activity no. 2
   private double grossEarnings;
   private double totalDeductions;
   private double netEarnings;
   private double basicPay;
   private double overtimePay=0;
   private double overtime;
   private double rate;
   private double tax;
   private double sss;
   private double philHealth;
   private double pagibig;
   

   //constructors
   public Employee(int n, String l, String f, char i, char employeeStatus, char employmentStatus, double n2){
      empNum = n;
      lname = l;
      fname = f;
      middleInitial = i;
      this.employeeStatus = employeeStatus;
      this.employmentStatus = employmentStatus;
      hoursWorked = n2;   
   }
   public Employee(){
      /* 
      empNum = 0;
      lname = "";
      fname = "";
      middleInitial = '\0';
      employmentStatus = "";
      employeeStatus = "";
      hoursWorked = 0;
      */  
      System.out.println("\n------------------------");
   }
   //setters
   //Activity no. 1
   public void setEmpNum(int n){
      empNum = (n<0)?0:n;
   }
   public void setLname(String l){
      lname = l;
   }
   public void setFname(String f){
      fname = f;
   }
   public void setMiddle(char i){
      middleInitial = i;
   }
   public void setEmpStatus(char employeeStatus){
      switch(employeeStatus){
         case 'S':
         case 'M':
         case 'W':
         case 'R': this.employeeStatus = employeeStatus;
         break;
         default: this.employeeStatus = '\0';
      }    
   }
   public void setEmploymentStatus(char employmentStatus){
      switch(employmentStatus){
         case 'R':
         case 'P':
         case 'C':
         case 'T': this.employmentStatus = employmentStatus;
         break;
         default: employmentStatus = '\0';
      }
   }
   public void setHoursWorked(double n2){
      hoursWorked = (n2<0)?0:n2;   
   }
   //getters
   //Activity no. 1
   public int getEmpNum(){
      return empNum;
   }
   public String getLname(){
      return lname;
   }
   public String getFname(){
      return fname;
   }
   public char getMiddle(){
      return middleInitial;
   }
   public char getEmpStatus(){
      return employeeStatus;
   }
   public char getEmploymentStatus(){
      return employmentStatus;
   }
   public double getHoursWorked(){
      return hoursWorked;
   }
   //Activity no. 2
   public double getRate(){
      switch(employmentStatus){
         case 'R': rate = 590.88;
         break;
         case 'P': rate = 525.38;
         break;
         case 'C': rate = 488.56;
         break;
         case 'T': rate = 415.10;
         break;
         default: rate = 0;
      }
      return rate;
   }
   public double getOvertimePay(){
      if(hoursWorked>120){
         overtime=hoursWorked-120;
         overtimePay=overtime*((rate/8)*1.5);
      }
      return overtimePay;
   }
   public double getBasicPay(){
      if(hoursWorked>=120){
         basicPay=rate*(120/8);
      }
      else{
         basicPay=rate*(hoursWorked/8);
      }
      return basicPay;
   }
   public double getGrossEarnings(){
      grossEarnings=basicPay+overtimePay;
      return grossEarnings;
   }
   public double getTax(){
      switch(employeeStatus){
         case 'S': tax=grossEarnings*.1575;
         break;
         case 'M': tax=grossEarnings*.1012;
         break;
         case 'W': tax=grossEarnings*.1235;
         break;
         case 'R': tax=grossEarnings*.1260;
         break;
         default: tax=0;
      }
      return tax;
   }
   public double getSSS(){
      if(grossEarnings>=12000){
         sss=grossEarnings*.115;
      }
      else if(grossEarnings>=9500){
         sss=grossEarnings*.105;
      }
      else if(grossEarnings>=0){
         sss=grossEarnings*.0916;
      }
      else{
         sss=0;
      }
      return sss;                                                                
   }
   public double getPhilHealth(){
      if(grossEarnings>=12000){
         philHealth=420;
      }
      else if(grossEarnings>=9500){
         philHealth=380;
      }
      else if(grossEarnings>=0){
         philHealth=290;
      }
      else{
         philHealth=0;
      }
      return philHealth;
   }
   public double getPagibig(){
      switch(employeeStatus){
         case 'M': pagibig=grossEarnings*.0375;
         break;
         case 'S': pagibig=grossEarnings*.0275;
         break;
         case 'W':
         case 'R': pagibig=grossEarnings*.0255;
         break;
         default: pagibig=0;
      }
      return pagibig;
   }
   public double getTotalDeductions(){
      totalDeductions=tax+sss+philHealth+pagibig;
      return totalDeductions;
   }
   public double getNetEarnings(){
      netEarnings=grossEarnings-totalDeductions;
      return netEarnings;
   }
   //toString() method
   public String toString(){
      return "\nEmployee Number: "+getEmpNum()+
             "  |  Employee Lastname: "+getLname()+
             "  |  Employee Firstname: "+getFname()+
             "  |  Employee Status: "+getEmpStatus()+
             "  |  Employment Status: "+getEmploymentStatus()+
             "  |  Hours Worked: "+df.format(getHoursWorked())+
             " hour(s)  |  Gross Earnings: "+df.format(getGrossEarnings())+
             "  |  Total Deductions: "+df.format(getTotalDeductions())+
             "  |  Basic Pay: "+df.format(getBasicPay())+
             "  |  Net Earnings: "+df.format(getNetEarnings())+
             "  |  OvertimePay: "+df.format(getOvertimePay())+"\n\n";
   }
}