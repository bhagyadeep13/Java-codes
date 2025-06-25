package frequently_used;


public class Decimal_to_base 
{
  public static String decimalToBase(int num, int base) {   // return String 
          if (num == 0) return "0";
          StringBuilder sb = new StringBuilder();
          while (num > 0) {
            int rem = num % base;
            sb.append(rem);
            System.out.println(rem+" "+num);
            num /= base;
          }
          return sb.reverse().toString();
        }
    public static void main(String[] args) 
    {
      int num = 98;
      int base = 3;
      System.out.println(decimalToBase(num, base));  // decimal to base me convert karna ho toh

      // is ka ulta below h 
      
      System.out.println(Integer.parseInt(decimalToBase(num, base),base)); // base to decimal me convert karna h toh
    }
}
