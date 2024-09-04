package Strings;

public class spilt_method 
{
    public static void main(String[] args) {
        String s="h e l l   o";
        String[] s2=s.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            System.out.print(s2[i]);
        }
    }
}
