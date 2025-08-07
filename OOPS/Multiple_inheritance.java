package OOPS;

interface Vehical
{
    //public static final int tyre=10; 
    void print(); // by default (public and abstract)
}
interface Vehical2
{
    //public static final int tyre=10; 
    void print2(); // by default (public and abstract)
}
class Car implements Vehical,Vehical2
{
    public void print() // here we have to set acccess modifier as public
    { 
        System.out.println("Car is running");
    }
    public void print2() // here we have to set acccess modifier as public
    { 
        System.out.println("Car is running 2");
    }
}
public class Multiple_inheritance 
{
    public static void main(String[] args) {
    Car c = new Car();
     c.print();
     c.print2();
}
}
