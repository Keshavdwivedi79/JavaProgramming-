import java.util.Scanner;

public class Even_Odd_Number_Without_Using_Arithmetic_Operations {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    if((num & 1)==0)
    {
        System.out.println("You Enter "+num+" ,Number is Even:");
    }
    else{
        System.out.println("You Enter " +num+" ,The Number is Odd:");
    }

    }
}
