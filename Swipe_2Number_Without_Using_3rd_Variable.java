import java.util.Scanner;

// public class Swipe_2Number_Without_Using_3rd_Variable {
//     public static void main(String[] args) {
//         int x, y;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers x and y:");
//         x = sc.nextInt();
//         y = sc.nextInt();
//         System.out.println("Before Swapping, the numbers are:\n" + x + "\n" + y);
//         x = x + y;
//         y = x - y;
//         x = x - y;
//         System.out.println("After Swapping, the numbers are:\n" + x + "\n" + y);
//     }
// }

/*#Issue:->The issue with the code lies in the swapping logic. When the sum of x and y exceeds the maximum value that can be stored in an int data type, integer overflow occurs. 
This means that the result of the addition operation may not fit within the range of the int data type, leading to unexpected results.
hashtag#TimeComplexity:->O(1)
hashtag#SpaceComplexity :-> O(1)
*/

/*
 *Solution:-
 The issue with the code lies in the swapping logic. When the sum of x and y exceeds the maximum value that can be stored in an int data type, integer overflow occurs.
  This means that the result of the addition operation may not fit within the range of the int data type, leading to unexpected results.

To fix this issue, you can use a different swapping technique that does not rely on the sum of the numbers.
 One common approach is to use the XOR operation. Here's an example of how you can modify the code to swap the values correctly:
 
 */



public class Swipe_2Number_Without_Using_3rd_Variable {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers x and y:");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping, the numbers are:\n" + x + "\n" + y);
        if(x!=y)
        {
            x = x^y;
            y = y^x;
            x = x^y;
        }
    
        System.out.println("After Swapping, the numbers are:\n" + x + "\n" + y);
    }
}

