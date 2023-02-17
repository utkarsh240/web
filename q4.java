class A
{
    static int count = 0;
    A()
    {
        count++;
    }
}

public class Main
{
    public static void q4(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        System.out.println(A.count);
    }
}
