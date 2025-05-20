package frequently_used;
import java.util.*;
public class a 
{ 
    public static boolean helper(StringBuilder s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                s.deleteCharAt(i);
                s.deleteCharAt(i);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        StringBuilder s=new StringBuilder(sc.next());
        while(helper(s)) // flag == true -> Arpit
        {                   // flag == false -> Abhinav
            flag=!flag;
        }
        if(flag==true)
        {
            System.out.println("Abhinav");
            return;
        }
        else
        {
            System.out.println("Arpit");
        }

    }
}
