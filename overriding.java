
 class overriding{
    void show()
    {
        System. out. println("hello");
    }
    }
    class xyz extends overriding
    {
        void show()
        {
            System. out. println("hi");
        }
    

    public static void main(String args[]){
       xyz obj=new xyz();
       obj. show();
       //overriding t=new overriding();
       //t. show();

    }
}
