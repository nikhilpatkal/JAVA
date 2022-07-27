import java.util.*;
class constructer
{
int rollno;
String name;
constructer()
{
int rollno;
String name;
}
constructer(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void show()
{
System.out.println("The rollno is "+rollno);
System.out.println("the name is "+name);
}
public static void main(String []args)
{
constructer s=new constructer();
constructer t=new constructer(117,"nikhil");
s.show();
t.show();
}
}

