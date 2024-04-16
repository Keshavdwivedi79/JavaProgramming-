package Convert_The_Number_to_Word;
import java.util.*;
public class MyProgram_Convert_Number_To_Word {
    //  step one 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int n =sc.nextInt();
        //  number of time we need to run the loop = no. of digits
        //  12884= loop runs fot 5x
        // 343 = 3x
        // int c=0;
        // for(int i =n ; i>0;i/=10)
        // {
        //     c++;
        // }
        // System.out.println(c);
        //  here we convert the string into number 
        //  and take the length
        String wrd = String.valueOf(n);
        int l = wrd.length();// for length of number i.e digit fin the number
        // Declaration of variables step 3
        String z="";
        int i=0;// for loop 
        // step 4 start the loop
        for(i=l-1;i>=0;i--)// backward loop 
        {
            
        }
    }
}
