package Ascii_Value_Java;
// this is the type-casting way for print the ascii value in java 
public class Using_TypeCasting {
    public static void main(String[] args) {
        // here we declared the variables
        char ch = 'n';
        char ch1= 'N';
        // here we use the TypeCasting conversion into char to int
        int asciiValue1 = (int)ch;
        int asciiValue2 = (int)ch1;
        System.out.println("the Ascii value of "+asciiValue1);
        System.out.println("the Ascii value of "+asciiValue2);
        // now print the Ascii value ...
    }
}
