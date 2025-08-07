package OOPS;

class Employee
{
    private String name;
    private int age;

    public void setter(String n,int a)
    {
        name = n;
        age = a;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class encapsulation 
{
    public static void main(String[] args) 
    {
        Employee ee = new Employee();
        ee.setter("Bhagyadeep", 21);
        System.out.println(ee.getAge());
        System.out.println(ee.getName());
    }
}
