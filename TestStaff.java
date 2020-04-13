import java.util.Scanner;
   public class TestStaff{
   
   static Scanner console = new Scanner(System.in);
   
      public static void main(String [] args){
      
         System.out.print("Enter Staff Name\t:");
         String staffName=console.next()+console.nextLine();
         System.out.print("Enter Staff ID\t:");
         String staffId=console.next()+console.nextLine();
         System.out.print("Enter how many working per day\t:");
         int workingDay=console.nextInt();
         
         double salary = workingDay*35;
         
         System.out.println();
         System.out.println("Staff Name\t:" +staffName);
         System.out.println("Staff ID\t:" +staffId);
         System.out.println("Staff working per day:" +workingDay + "day");
         System.out.println("Staff Salary\t:RM" +salary);
         
         }//end main
         
     }//end class
         
         