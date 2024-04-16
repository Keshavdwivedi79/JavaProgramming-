import java.util.*;
class Userinput {
    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);    
         System.out.println("Whats your name: ");  //tHere is String Data
         String s = sc.nextLine();
         System.out.println("My Name is = " +s);

         System.out.println("Whats Your Age: "); //Here is Numeric Data
         int a= sc.nextInt();
         System.out.println("My Age is =" +a);

         System.out.println("What is your CGPA in B.Tech ?  "); //Here is Fractional Data 
         Float f = sc.nextFloat();
         System.out.println("My CGPA IS =" +f);
     
         System.out.println("What About your Salary ? "); //Here is also Fractional Data but data size is bigger than....!
         Double d= sc.nextDouble();
         System.out.println("My Salary is 🤥 =" +d);
    
        System.out.println("Enter the Long Data: "); 
        Long l =sc.nextLong();
        System.out.println("The Data is=" +l);
   
        System.out.println("Enter the Short Data:"); 
        Short sh = sc.nextShort();
        System.out.println("The Data is=" +sh);
  
       
    }
}