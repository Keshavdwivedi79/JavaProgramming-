import java.util.*;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          System.out.println("Enter the low Number of Range=");
         int low = scn.nextInt();
          System.out.println("Enter the higher Number of Range=");
         int high = scn.nextInt();
           
        for(int n=low; n<=high; n++)
        {
            int count=0;
         for(int div=2;div*div<=n;div++)
         {
             if(n%div==0){
                  count++;
                  break;
             }
         }
      
        
        if(count==0)
        {  
             System.out.println(n);
            
        }
    }
}
}

