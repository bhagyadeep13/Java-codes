package arraylist;
import java.util.*;
public  class basic 
{    public static void main(String[] args) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        al.set(1,60);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        Collections.sort(al);
        System.out.println(al);
        
    }
    
}
