import java.util.Scanner;

public class ReverseNumberUsingRecursion {
    public static void setRecursion(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
         else 
         {
            System.out.print(number % 10);
            setRecursion(number / 10);// it is break the number with replace last value
          }
       }

    public static void main(String args[]) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The Reverse Number is:");
        setRecursion(num);
    }
}
