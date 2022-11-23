
 class this1{
     int i;
     void xyz(int i)
     {
         i=i;//when we not give this key hear then this will print local variable value 0 
     }
     int  show()
     {
        return i;
     }

    public static void main(String args[]){
       this1 n1= new this1();
       n1. xyz(10);//call hear 
      System. out.println(n1. show());

    }
}
