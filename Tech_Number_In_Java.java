import java.util.Scanner;

public class Tech_Number_In_Java {  
    public static void main(String args[])  
    {  
    int count=0;    
    int sumOfSquare=0;
    int sum=0;
    int firsPart, secondPart;  
    Scanner sc = new Scanner( System.in );  
    System.out.print("Enter the number to check: ");  
    int n=sc.nextInt();  
    int num =n;
    while(num>0)  
    {  
    count++;  
    num=num/10;  
    }  
    if(count%2==0){
     num =n;
    // split the number two part
    firsPart = num%(int) Math.pow(10,count/2);
    secondPart = num/(int) Math.pow(10,count/2);
   sum= firsPart+secondPart;
    sumOfSquare=(sum)*(sum);
    }
    else{
       System.out.println("Please Enter the even Number Of Digit");
    }
    if(sumOfSquare==n){
        System.out.println("The given number is a tech number.");  
    }
   else  {
    System.out.print("The given number is not a tech number.");  
        }  
   }
}

