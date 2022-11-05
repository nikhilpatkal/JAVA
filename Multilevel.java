///program for multilevel inheritance 


import java.util.*;
class Emp
{
int empid;
String empname;
String empcontact;
Scanner sc=new Scanner (System.in);
void reademp()
{
System.out.println("enter the empid");
empid=sc.nextInt();
System.out.println("enter the name emp");
empname=sc.next();
System.out.println("enter emp contact number");
empcontact=sc.next();
}
void printemp()
{
System.out.println("the emp name is"+empname);
System.out.println("the emp empid is"+empid);
System.out.println("the empcontact number "+empcontact);
}
}
class program extends Emp
{
int salarybonus;
int salary;
//int bonus=salarybonus+salary;
void readsalary()
{
System.out.println("enter the salary bonus of emp");
salarybonus=sc.nextInt();
System.out.println("enter the salary");
salary=sc.nextInt();
}
void printsalary()
{
System.out.println("the salary of emp is="+salarybonus);
System.out.println("the salary of emp is ="+salary);
//System.out.println("the salary with bonus ="+bonus);

}
public static void main(String args[])
{
program p=new program();
p.reademp();
p.readsalary();
p.printemp();
p.printsalary();
System.out.println("the salary with bonus is="+((p.salary)+(p.salarybonus)));


}
}




