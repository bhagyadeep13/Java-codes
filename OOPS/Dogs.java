package OOPS;

class Animal
{
    
    void eat()
    {
        System.out.println("Animal Can Eat");
    }
}
public class Dogs extends Animal
{
    void run()
    {
        System.out.println("Dogs Can run");
    }
    public static void main(String[] args) 
    {
        Dogs d = new Dogs();
        d.eat();
        d.run();
    }
}
