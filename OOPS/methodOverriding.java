package OOPS;

class Animal
{
    void print()
    {
        System.out.println("Animal");
    }
}
class Dog extends Animal
{
    void print()  // this method overide the method of parent class
    {
        System.out.println("dog");
    }
}

public class methodOverriding 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.print();
    }
}
