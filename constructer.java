//this is an parametric constructer examole


import java.util.*;
class nikhil
{
Scanner sc=new Scanner(System.in);

int rollno;
String name;
String collage;
nikhil(int roll,String name1,String collage1)
{
rollno=roll;
name=name1;
collage=collage1;
}
/*void getus()
{
System.out.pritnln("enter the rollno");
rollno=sc.nextInt();
System.out.println("enter the name");
name=sc.next();
System.out.println("enter the collagename");
collage=sc.next();
}*/
void show()
{
System.out.println("the roll no"+rollno);
System.out.println("the name of student"+name);
System.out.println("the collage name is"+collage);
}
public static void main(String [] args)
{
nikhil n1=new nikhil(117,"nikhil","new art");
n1.show();
}
}

