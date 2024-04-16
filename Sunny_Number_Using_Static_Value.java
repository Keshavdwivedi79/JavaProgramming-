package Sunny_Number_java;

import java.util.Scanner;

public class Sunny_Number_Using_Static_Value {
    public static void main(String args [])
    {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();

        // here we need static value
        int n = 8;// here the Sunny Number 
        int next = n+1;
        double square = Math.sqrt(next);// this method return double value so that we use double datatype 
        //  if we need integer value so use typecasting (int) Math.sqrt();
        double square_root = Math.floor(square);
        // it is return the squareRoot of the number (9)*2 like this type

        if((square-square_root)==0)// it is confirm the value is integer value
        {
            System.out.println("The Number is Sunny Number: ");

        }
            else{
                  System.out.println("The Number does  not Sunny Number");
                }


         }
    }
