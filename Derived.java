// Example using various Access Specifiers in different classes
class Base
{
int a=10;
private int b=20;
protected int c=30;
public int d=40;
}
class Derived extends Base
{
void show()
{
System.out.println("Value of a="+a);
//System.out.println("Value of b="+b);
System.out.println("Value of c="+c);
System.out.println("Value of d="+d);
}
public static void main(String args[])
{
Derived d=new Derived();
d.show();
}}

When we execute the above program it gives error message for 
the statment
System.out.println("Value of b="+b);
This is because data member 'b' is declared private in Base Class.




