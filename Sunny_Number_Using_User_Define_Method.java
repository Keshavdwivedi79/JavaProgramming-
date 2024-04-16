package Sunny_Number_java;
// user Define Method 
public class Sunny_Number_Using_User_Define_Method {
    

    public static  boolean checkNumberIsSunny(int n )// here when we using boolean so that 
    {
         int next =n+1;
       double square= Math.sqrt(next);
       return (square-Math.floor(square)==0);// here we write the condition
    }
    public static void main(String[] args) {
       int inp=10;
       if(checkNumberIsSunny(inp))// so that it is used you can
       {
        System.out.println("Sunny");
       }
       else{
        System.out.println("Not Sunny");
       }
       }
    }

