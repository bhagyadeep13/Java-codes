package OOPS;

public class encapsulation 
{
    static class Employee
    {
    private String name;
    private int age;

    private void setter(String n,int a)
    {
        this.name = n;
        this.age = a;
    }
    private int getAge()
    {
        return age;
    }
    private String getName()
    {
        return name;
    }
}
    public static void main(String[] args) 
    {
        Employee ee = new Employee();
        ee.setter("Bhagyadeep", 21);
        System.out.println(ee.getAge());
        System.out.println(ee.getName());
    }
}
