import java.util.Scanner;

class ArmstrongProgram{
//     public static void main(String[] args) {
//         int num, temp, sum=0, number;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the  number: ");
//         num = sc.nextInt();
//         number = num;
//         while(number!=0)
//         { 
//             temp=number%10;
//             sum = result+temp*temp*temp;
//             number=number/10;
    
//         }
//         if(sum==num)
//         {
//             System.out.println(num+" Number is an Armstrong Number");
//         }
//         else{
//             System.out.println(num+" Number is Not an Armstrong Number");
//         }



//     }

    public static void main(String[] args) 
     { int n, number, temp , sum=0;
        Scanner sc= new Scanner(System.in);
         n = sc.nextInt();
         for(int i =1;i<n;i++)
         {
            n=i;
            while(n!=0)
            {
                temp=n%10;
                sum= sum+(temp*temp*temp);
                number = n/10;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
            else{
                System.out.println("this is not a Valid range");
         }
     }
}
}
