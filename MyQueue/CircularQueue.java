package MyQueue;
class Queue
{
    int[] a = new int[5];
    int f=-1,r=-1;
    int size=0;
    public void add(int val) throws Exception
    {
      if(size==a.length)
      {
        throw new Exception("Queue is Full!........");
      }
      else if(size==0)
      {
        f=0;
        r=0;
        a[r] = val;
      }
      else
      if(r==a.length-1)
      {
        a[0] = val;
        r=0;
      }
      else 
      if(r<a.length-1)
      {
        a[r+1]=val;
        r++;
      }
      size++;
    }
    public int peek() throws Exception
    {
      if(size==0)
      {
        throw new Exception("Queue is Empty");
      }
      return a[f];
    }
    public int remove() throws Exception
    {
      if(size==0)
      {
        throw new Exception("Queue is Empty!......");
      }
      else if(f==a.length-1)
      {
        int val = a[f];
        f=0;
        size--;
        return val;
      }
      else 
      {
        int val = a[f];
        f++;
        size--;
        return val;
      }
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
      if(f<=r)
      {
      for(int i=f;i<=r;i++)
      {
        System.out.print(a[i]+" ");
      }
      }
      else // rear < front
      {
      for(int i=f;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
      for(int i=0;i<=r;i++)
      {
        System.out.print(a[i]+" ");
      }
      }
    }
}
public class CircularQueue 
{
  public static void main(String[] args) throws Exception
  {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.f+" "+q.r);
    q.remove();
    q.remove();
    q.remove();
    q.remove();
    q.display();
  }
}

