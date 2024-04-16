package Ascii_Value_Java;

import java.util.Scanner;
public class Find_The_Ascii_Value_Using_User_input {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Value for print the Ascii value ");
        char ch = sc.next().charAt(0);
         int a= ch;
         System.out.println("The Ascii value is : "+a);

        
    }
   
}
