//string method  &&&&%%%****

//length fun and charAt functio

class nikhil
{
public static void main(String [] args)
{
String  str3="my collage Name is NACSCA";
 String str="hi   nikhil";
String str2="patkal";
System.out.println("length of string is="+str.length());
System.out.println("charAt of string is="+str.charAt(2));//it return character at  i th posistion 
//System.out.println("substring of string is="+str.subString(3));
System.out.println("length of string is="+str.concat(str2));//concat
int index=str.indexOf("nikhi");//this is index of string
System.out.println("length of string is="+index);
int lastindex= str.lastIndexOf('i');//it give last index
System.out.println("last index"+lastindex);
System.out.println(str.equals(str2));//it check equals
//System.out.println(str.equalsIgnorCase(str2));
System.out.println(str.toUpperCase());// it convert to upper
System.out.println(str.toLowerCase());// it convert to upper
System.out.println(str.length());
System.out.println(str.trim());//use for remove spaces
System.out.println(str.length());
System.out.println(str.replace('h','H'));//it use to replace 
String str6=str3.replaceAll("is","was");//use repace specick latter
System.out.println( str6);
}
}