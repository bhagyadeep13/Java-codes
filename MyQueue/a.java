package MyQueue;

public class a 
{
  public static void subsequence(int idx,String s,String s1)
  {
      if(idx==s.length()) 
      {
        System.out.println(s1);
        return;
      }
      subsequence(idx+1, s,s1+s.charAt(idx));
      subsequence(idx+1, s, s1);
  }
  public static void main(String[] args)  
  {
      subsequence(0, "abc", "");
  }
}
