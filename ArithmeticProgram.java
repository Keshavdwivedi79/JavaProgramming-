class Add{
 int x, y;
 void set( int p, int q){

    x=p;
    y=q;
    
 }
 void Display(){
    
    System.out.println(x);
    System.out.println(y);
    System.out.println("The Sum Value is :"+(x+y));
 }
}
class Sub{
  int x , y;
  void set1(int a, int b)
  {
    x=a;
    y=b;
  }  // subtract
  void Display1()
  {
    System.out.println(x);
    System.out.println(y);
    System.out.println("The Subtract Value is :"+(x-y));
  }
}
class Multi{
     int x , y;
  void set2(int n, int m)
  {
    x=n;
    y=m;
  }
  void Display2()
  {
    System.out.println(x);
    System.out.println(y);
    System.out.println("The Multiply Value is :"+(x*y));
  }

}
class Divide{
   float x , y;
    void set3(int f, int g)
    {
       x=f;
       y=g;
      System.out.println(f);// here we are pass the value 
      System.out.println(g);
        
    }
    void Display3()
    {
        System.out.println(x);// here  Compiler Convert The Integer Value to Float Value  
        System.out.println(y);
        System.out.println("The Divide Value is :"+(x/y)); 
    }
}

 class ArithmeticProgram {
    public static void main(String arcs[])
    {
     Add obj = new Add();
     obj.set(2,5);
     obj.Display();     
    Sub obj1 = new Sub();
      obj1.set1(58,90);
      obj1.Display1();
     Multi obj2= new Multi();
     obj2.set2(49,60);
      obj2.Display2();

    Divide obj3= new Divide();
    obj3.set3(34,12);
    obj3.Display3();
    }

    
}
