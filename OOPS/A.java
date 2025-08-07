package OOPS;

class A
{
    int i=9;
    public void helper()
    {
        i = 10;
    }
    public void helper2()
    {
        System.out.println(i);
    }
    public static void main(String[] args) 
    {
        A k = new A();
        k.helper();
        k.helper2();
        System.out.println(k.i);  // to print a variable of a class 

    }
}
