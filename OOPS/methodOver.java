package OOPS;

class Animal
{
    void print()
    {
        System.out.println("Animal");
    }
    void print(String name)
    {
        System.out.println(name);
    }
}

public class methodOver 
{
    public static void main(String[] args) {
    
    Animal a = new Animal();
    a.print();
    a.print("name");
    }
}
