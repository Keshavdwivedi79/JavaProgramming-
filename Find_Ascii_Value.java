
public class Find_Ascii_Value {
//this the way of Assigning a variable to a int value 
//  here we don't use the and method and class 
// java internally convert the character value to Ascii Value 
//  we know Ascii value of 
// A -> 65 ,
//  a->97 ,
//  & 0 to 9->48 to 57
     public static void main(String args[])
     {
        char ch = 'a';
        char ch1 = 'b';
        int valueAscii1=ch;
        int valueAscii2= ch1;
     System.out.println("The Value of "+ch+" is " +valueAscii1);
     System.out.println("The Value of "+ch1+" is " +valueAscii2);
    }
    
}