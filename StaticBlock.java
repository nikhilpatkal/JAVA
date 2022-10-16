// Example using static block

class StaticBlock
{
static
{
System.out.println("First static block");
}

void show()
{
System.out.println("Show method");
}

public static void main(String args[])
{
StaticBlock s=new StaticBlock();

System.out.println("Main Method");

s.show();
}  // end of main()

static
{
System.out.println("Second static block");
s.show();
}
}