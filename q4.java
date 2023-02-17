class q8
{
    static int count=0;
    q8()
    {
        count++;
    }
    public static void main(String args[])
    {
        q8 obj1=new q8();
        q8 obj2=new q8();
        q8 obj3=new q8();
        q8 obj4=new q8();
        q8 obj5=new q8();
        System.out.println("Number of objects created: "+count);
    }
}
