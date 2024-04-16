import java.lang.Math;// Math.random()
import java.util.Random;// Random Class
import java.util.concurrent.*;// this is using for TheLocalRandom Class 
import java.util.Scanner;
class RandomNumberGenerater {
    public static void main(String[] args) {
        int n = ThreadLocalRandom.current().nextInt(2);// this is the TheLocalRandom Class calling 
         System.out.println(n);
        // Here we use  Random Class 
        Random random = new Random();
        // Generates random integers 0 to 39
        int x = random.nextInt(20);// here we use nextInt(int bound)
        System.out.println(x);
        // Generates random integers 0.0 to 59.0
        double  y = random.nextDouble(60);// here we use nextDouble(double bound)
        System.out.println(x);
        System.out.println(y);
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Maximum Range Number");
//     int max= sc.nextInt();
//     System.out.println("Enter the Minimum Range Number");
//     int min = sc.nextInt();
//     double a = Math.random()*(max-min+1)+min;// Using random() function
//     System.out.println("The Number is: "+a);
//     //  we can convert the value  double number to integer number 
//    System.out.println("Random Value int Type Between "+ max + "to" + min);
//    int b = (int)(Math.random()*(max-min+1)+min);
//    System.out.println(b);  
//    System.out.println("1st Random Number: " + Math.random());   
//    System.out.println("2nd Random Number: " + Math.random());  
//    System.out.println("3rd Random Number: " + Math.random());   
//    System.out.println("4th Random Number: " + Math.random()); 

   }   
}



