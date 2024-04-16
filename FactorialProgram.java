import java.util.Scanner;
class FactorialProgram{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the any number for the Factorial :");
    int n=sc.nextInt();
             int fact=1;// int given 4 bytes Space on memory
         // double fact=1;// Double Occupied 8 bytes space on memory
        // float fact=1;// float occupied 4 bytes on memory
        for(int i=1;i<=n;i++)
        {
          fact= fact*i;
          
        }
        System.out.println(fact);
        
    }
    
}















































//     static int factorial(int n)
//     {

//     if (n==0)
//     {
//         return 1;
//     }
    
    
//     else
//     {
//         return (n*factorial(n-1));
//     }
    
//     }
//     public static void main(String args[])
//     {
//         System.out.println("Numbber of 5 Factorial is:" +factorial(5));
//     }
// }