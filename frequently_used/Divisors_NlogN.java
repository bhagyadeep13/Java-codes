package frequently_used;

public class Divisors_NlogN 
{
    // Note 
    // “Only perfect squares have an odd number of divisors.”
    // Find half of the divisors and then n/i to find next halfs
    public static void main(String[] args) 
    {
        int n=21;
        int i=1;
        while(i<Math.sqrt(n))
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
