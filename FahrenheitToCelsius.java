import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String args[])
    {
        Float temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Temperature in Fahrenheit : ");
        temp = sc.nextFloat(); // Read the input as a float directly
        temp = (temp - 32) * 5/9; // Convert Fahrenheit to Celsius
        System.out.println("The Temperature in Celsius : "+temp);
    }
}
