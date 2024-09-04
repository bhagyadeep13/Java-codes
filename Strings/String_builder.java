package Strings;
import java.util.*;
public class String_builder
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // DECLARATION
        StringBuilder s=new StringBuilder("bhagyadeep");
        System.out.println(s);

        //  CAPACITY() AND LENGTH()

        StringBuilder s3=new StringBuilder("");
        System.out.println(s3.capacity());  // BY DEFAULT CAPACITY()= 16;

        
        StringBuilder s1=new StringBuilder(10);
        System.out.println(s1.capacity());
        System.out.println(s1.length());
    }
}
