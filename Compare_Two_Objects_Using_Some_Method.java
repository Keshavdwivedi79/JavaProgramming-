//Today i learn hoe to invoke equals() method 
public class Compare_Two_Objects_Using_Some_Method 
{  
public static void main(String[] args)   
{  
//creating constructor of the Double class   
Double x = new Double(123.45555);  
//creating constructor of the Long class   
Long y = new Long(9887544);  
//invoking the equals() method   
System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));  
}  
}  

/*public class HashcodeMethodCalling  
{  
public static void main(String[] args)   
{  
//creating two instances of the Employee class  
Employee emp1 = new Employee(918, "Maria");  
Employee emp2 = new Employee(918, "Maria");  
//invoking hashCode() method  
int a=emp1.hashCode();  
int b=emp2.hashCode();  
System.out.println("hashcode of emp1 = " + a);  
System.out.println("hashcode of emp2 = " + b);  
System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
}  
}  */
