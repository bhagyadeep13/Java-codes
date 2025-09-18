package OOPS;

public class p 
{
    static class Animal
    {
        void dog()
        {
            System.out.println("Animal");
        }
    }
    static class Dog extends Animal
    {
        void dog()
        {
            System.out.println("Dog");
        }
        void dog(int a)
        {
            System.out.println("Dog"+" "+a);
        }
        public static void main(String[] args) 
        {
            Dog d = new Dog();
            d.dog();
            d.dog(1);
        }
    }
}
