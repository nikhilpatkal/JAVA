class DestructorDemo
{
int a,b;
DestructorDemo(int a,int b)
{
this.a=a;
this.b=b;
}
void show()
{
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
protected void finalize()
{
System.out.println("Object is Destroyed");
}

public static void main(String args[])
{
DestructorDemo d=new DestructorDemo(10,20);
d.show();
}
}