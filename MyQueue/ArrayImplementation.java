package MyQueue;
class Queue
{
  int[] a = new int[10];
  int front=0,rear=-1;
  int size=0;
  public void add(int val)
  {
    if(rear==a.length-1)
    {
      System.out.println("Queue is Full");
      return;
    }
    a[rear+1]=val;
    rear++;
    size++;
  }
  public int peek()
  {
    if(size==0) 
    {
      System.out.println("Queue is Empty");
      return Integer.MIN_VALUE;
    }
    return a[front];
  }
  public int remove()
  {
    if(size==0) 
    {
      System.out.println("Queue is Empty");
      return Integer.MIN_VALUE;
    }
    int val = a[front];
    front++;
    size--;
    return val;
  }
  public int size()
  {
    return size;
  }
  public boolean isEmpty()
  {
    if(size==0) return true;
    else return false;
  }
  public void display()
  {
    for(int i=front;i<=rear;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  //System.out.println(front+" "+rear);
  }
}
public class ArrayImplementation 
{
  public static void main(String[] args) 
  {
      Queue q=new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.display();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.add(8);
  }
}
