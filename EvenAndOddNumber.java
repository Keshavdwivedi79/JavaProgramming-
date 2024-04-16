// import java.util.*;
// class EvenAndOddNumber{
//      int n=15;
//      void checkNumber()
//      {
//         if(n%2==0)
//         {
//             System.out.println(+n+" is the Even Number"); 
//         }
//         else {
//             System.out.println(+n+" is the Odd Number ");
//             System.out.println(n%2);
//         }
//      }
//     public static void main(String args[])
//     {
//         EvenAndOddNumber obj = new EvenAndOddNumber();// with object calling 
//         obj.checkNumber();
//     }
// }





import java.util.*;
class EvenAndOddNumber{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number");
    int n = sc.nextInt();
    if (n<0)  //Zero (0) is also considered an even number because it is divisible by 2 without leaving a remainder.
    {
        System.out.println(+n+" I can't Check Even And Odd These Number...!,Please Try Again ");
    }
    else if(n%2==0)
    {
        System.out.println(+n+" Number is Even: ");
    }
    else 
    {
        System.out.println(+n+" Number is Odd: ");
    }
}

}


















// import java.util.*;
// class EvenAndOddNumber{
//  public static void main(String[] args)
//  {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter The Number");
//     int n = sc.nextInt();
//  System.out.println("There are Even Numbers: ");
//     for(int i=1;i<n;i++)
//     {
//         if(i%2==0)
//         {
//            System.out.println(i);
//         }
    
//     }
//     System.out.println("There are Odd Numbers: ");
//     for(int j=1;j<n;j++)
//     {
//         if(j%2!=0)
//         {
//            System.out.println(j);
//         }
    
//     }
//     }

// }

  
