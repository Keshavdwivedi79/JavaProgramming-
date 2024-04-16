import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[])
    {
      System.out.println("Enter the Any number for Check The Number is Palindrome Number: ");
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
    
      int r , sum =0, temp;
      temp= n;
    while (n>0) {
        r= n%10;// get reminder
        sum = (sum*10)+r; // First in sum multiply by 10 than add r value
        n =n/10; // get mode value
        
    }
    if(temp==sum)
    {
        System.out.println("The Number is Palindrome Number.!");

    }
    else 
    {
        System.out.println("The Number is  Not Palindrome Number.!");

    }

    }
    
}
