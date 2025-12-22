package array;

public class a 
{
    static class Bhagyadeep
    {
        static int[] a = new int[100];
        static int idx = 0;

        public static void push(int n)
        {
        if(idx==a.length)
        {
            System.out.println("Stack is full");
            return;
            }
        a[idx] = n;
        idx++;
        }
        public static int pop()
        {
            if(idx==-1) 
            {
                System.out.println("stack is empty");
                return -1;
            }
            int val = a[idx];
            idx--;
            return val;
        }
        public static void display()
        {
            for(int i=0;i<idx;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
}
    public static void main(String[] args) 
    {
        Bhagyadeep b = new Bhagyadeep();
        // b.push(10);
        // b.display();
        // b.push(20);
        // b.pop();
        // b.display();
        // b.push(30);
        // b.display();
        // b.push(40);
        // b.display();
        for(int i=0;i<100;i++)
        {
            b.push(i);
        }
        b.display();
    }

}
    
