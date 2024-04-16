// package Ascii_Value_Java;

// public class Check_the_Number_Is_Automorphic
// {
//        static boolean  isAutomorphicNumber(int num)
//        {
//         int square = num*num;
//         while (num>0) {
//                if(num%10!= square%10) 
//                  return false;
//                  num/=10;
//                  square/=10;
              
//         }
//         return true;
//        }
//     public static void main(String args[])
//     {
//      System.out.println(isAutomorphicNumber(6)? "Automorphic number": "Not Automorphic Number");
//      System.out.println(isAutomorphicNumber(76)? "Automorphic number": "Not Automorphic Number");
//     }
// }
package Ascii_Value_Java;
import java.util.*;
public class Check_the_Number_Is_Automorphic{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your number:");
        int num = sc.nextInt();
        int square = num*num;
        int count =0;
        int temp =num;
        while(temp>0)
        {  
                count++;
                temp=temp/10;

        }
        int lastDigit =(int) (square%(Math.pow(10, count)));
        if(num==lastDigit){
            System.out.println("The number is Automorphic Number"); // 6x6 =36 last digit same 
        }
        else{
            System.out.println("The number is Not a Automorphic Number");
        }
     

    }
}

// package Ascii_Value_Java;
// import java.util.*;
// public class Check_the_Number_Is_Automorphic{

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the your number:");
//         int num = sc.nextInt();
//         int square = num*num;
//         int temp = num;
//         int count =0;
//         while(temp>0)
//         {  
            
//                 count++;
//                 temp=temp/10;
//         }
//         int lastDigit = (int)(square%(Math.pow(10, count)));
//         if(lastDigit== temp)
//         System.out.println("Automorphic number");
//         else
//         System.out.println("Not Automorphic number");
//     }
// }


// package Ascii_Value_Java;
// import java.util.*;
// public class Check_the_Number_Is_Automorphic{


//      private  static boolean isAutomorphicNumber(int num )
//      {
//         int square = num*num;
//         int count =0;
//         int temp= num;
//         while(temp>0)
//         {
//                 count++;
//                 temp=temp/10;
//         }
//         int lastDigit = (int) (square%(Math.pow(10, count)));
//         return num==lastDigit;
//      }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the upper range of number:");
//         int upper = sc.nextInt();
//         System.out.println("Enter the upper range of number:");
//         int lower= sc.nextInt();
//         for(int i =upper;i<lower;i++)
//         {
//             if(isAutomorphicNumber(i))// calling the user define method
//           System.out.println(i+" ");
//         }


//     }
// }
