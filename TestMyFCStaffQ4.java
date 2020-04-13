import java.util.Scanner;
   public class TestMyFCStaffQ4{
   
   static Scanner input = new Scanner(System.in);
   
      public static void main(String [] args){
         String staffName,staffId;
         int hoursWorks;
         double totalSales=0,totalSalary=0;
         
         System.out.print("Enter Staff Name\t:");
         staffName=input.next()+input.nextLine();
         System.out.print("Enter Staff ID\t:");
         staffId=input.next()+input.nextLine();
         System.out.print("Enter how many hours works\t:");
         hoursWorks=input.nextInt();
         System.out.print("Enter total sales\t:RM");
         totalSales=input.nextDouble();
         
         MyFCStaff staff = new MyFCStaff(staffName,staffId,hoursWorks,totalSales);
         System.out.println();
         System.out.println(staff.toString());
                  }//end main
       }//end class TestMyFCStaff
       
       class MyFCStaff{
         private String staffName,staffId;
         private int hoursWorks;
         private double totalSales=0,commission=0,totalSalary=0;
         
         public MyFCStaff(String staffName,String staffId,int hoursWorks,double totalSales){
            this.staffName =staffName;
            this.staffId =staffId;
            this.hoursWorks =hoursWorks;
            this.totalSales =totalSales;
            }//end MyFCStaff
            
            public double calculateCommission(){
               if(totalSales>=150 && totalSales<=300){
                  commission=totalSales*0.05;
                     }else if(totalSales>=301 && totalSales<=500){
                              commission=totalSales*0.10;
                              }else if(totalSales>500){
                                    commission=totalSales*0.15;}
                                    
                                    return commission;
                                    }//end calculateCommission
                                    
             public double calculateSalary(){
               double totalSalary=(hoursWorks * 8) + calculateCommission();
               return totalSalary;
               }//end calculateSalary
               
         public String toString(){
            String name,id,houWok,totSales,totSalary;
            System.out.println();
            name=String.format("Staff Name\t:" +staffName);
            id=String.format("\nStaff ID\t:  " +staffId);
            houWok=String.format("\nTotal hours works\t:"  +hoursWorks +  "hours");
            totSales=String.format("\nTotal Sales\t:RM%.2f\n",totalSales);
            totSalary=String.format("Staff Salary\t:RM%.2f" ,calculateSalary());
            
            return name+id+houWok+totSales+totSalary;
            }//end displaySalary
          }//end MyFCStaff
         
        