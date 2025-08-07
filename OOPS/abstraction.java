package OOPS;

abstract class Vehical
{
    int tyre;
    abstract void print();
}
class Car extends Vehical 
{
    void print()
    {
        System.out.println("Car is running");
    }
}
class Bike extends Vehical
{
    void print()
    {
        System.out.println("Bike is running");
    }
}
public class abstraction 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.print();
        Bike b = new Bike();
        b.print();
    }
}
