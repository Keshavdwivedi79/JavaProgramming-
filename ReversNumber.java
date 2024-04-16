import java.util.*;
class ReversNumber{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int remainder= 0;
        int rev = 0;
        while(n!=0)
        {
           remainder = n%10;
           rev = rev*10+remainder;
           n= n/10;
        }
        System.out.println(rev);
        System.out.println(remainder);

    }
}
