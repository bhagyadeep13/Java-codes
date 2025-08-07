package OOPS;
interface Vehical
{
    //public static final int tyre=10; 
    abstract void print(); // by default (public)
}
class Car implements Vehical 
{
    public void print() // here we have to set acccess modifier as public
    { 
        System.out.println("Car is running");
    }
}
class Bike implements Vehical
{
    public void print() // here we have to set acccess modifier as public 
    {
        System.out.println("Bike is running");
    }
}
public class interfaceDemo 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.print();
        Bike b = new Bike();
        b.print();
    }
}
