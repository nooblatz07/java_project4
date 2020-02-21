import java.util.Scanner;
public class Test_Employee {
   public static void main(String[]args) {
   Scanner sc = new Scanner(System.in);
 /*  EMPLOYEE E1 = new EMPLOYEE(18797480,"Lovino","Client",'L','S','C',8); 
   System.out.println(E1);*/
   
   int num;
   do {
   System.out.print("\nEnter how many employee: ");
    num = sc.nextInt();
    System.out.print("\n");
   if(num < 0) {
   System.out.print("Must ne positve Integer");}
   }while(num < 0);
   
   EMPLOYEE E2[] = new EMPLOYEE[num];
   for(int i = 0; i < E2.length; i++) {
   char es = '\0';
   char ems ='\0';
   double hw;
   int n;
    do {
   System.out.print("Employee ID number: ");
   n =sc.nextInt();
   if(n <0) {
   System.out.println("Must be positive Integer! "); }
   }while(n < 0);
   
   sc = new Scanner(System.in);
   System.out.print("Last name: ");
   String ln =sc.nextLine();
   System.out.print("First name: ");
   String fn = sc.nextLine();
   System.out.print("Middle Initial: ");
   char mi = sc.nextLine().charAt(0);
   
     do {
   System.out.println("\n Select Employee status: \n Single-(S/s) \n Maried-(M/m) \n Widow-(W/w) \n Widower-(D/d)");
   System.out.print("Employee status: ");
   es = sc.nextLine().charAt(0);
     if(es != 'S' && es != 's' && es != 'M' && es != 'm' && es != 'W' && es != 'w' && es != 'D' && es != 'd'){
   System.out.println("\nTRY AGAIN!!!");  }
   } while(es != 'S' && es != 's' && es != 'M' && es != 'm' && es != 'W' && es != 'w' && es != 'D' && es != 'd');
      
   do {
    System.out.println("\n Select  Employment status: \n Regular-(R/r) \n Probationary-(P/p) \n Casual-(C/c) \n Part time-(T/t)");
    System.out.print("Employment status: ");
    ems = sc.nextLine().charAt(0);
   if(ems != 'R' && ems != 'r' && ems != 'P' && ems != 'p' && ems != 'C' && ems != 'c' && ems != 'T' && ems != 't') {
   System.out.println("\nTRY AGAIN!!!");}
    }while(ems != 'R' && ems != 'r' && ems != 'P' && ems != 'p' && ems != 'C' && ems != 'c' && ems != 'T' && ems != 't');
   do {
   System.out.print("Employee Hours worked: ");
   hw = sc.nextDouble();
   if(hw < 0) {
   System.out.println("Must be Positive  Integer! ");}
   }while(hw < 0);
   
   System.out.println("--------------------------");
   
   
   E2[i] = new EMPLOYEE(n,ln,fn,mi,es,ems,hw);    
   E2[i].setRate(); 
   E2[i].setOvertime();
   E2[i].setbasicPay();
   E2[i].setgrossEarnings();
   E2[i].setTax();
   E2[i].setSSS();
   E2[i].setpHealth();
   E2[i].setpagIbig();
   E2[i].settDeductions();
   E2[i].setnetEarnings();  
 } 
   for(int ctr = 0; ctr < E2.length; ctr++) {
   System.out.print(E2[ctr]);
 }
   System.out.print("GOD BLESS :-)");
 }
}