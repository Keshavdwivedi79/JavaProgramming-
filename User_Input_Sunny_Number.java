package Sunny_Number_java;
import java.util.*;
public class User_Input_Sunny_Number {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int next = n+1;
     double square = Math.sqrt(next);// it is given  the fractional value 
     // here we need convert the integer value 
     int square_root= (int)Math.floor(square);
    if(square-square_root==0)
    {
        System.out.println("The number is Sunny");
    }
    else{
        System.out.println("The number does not Sunny");
    }
}

}