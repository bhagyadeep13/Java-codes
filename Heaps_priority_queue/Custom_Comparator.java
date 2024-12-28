package Heaps_priority_queue;
import java.util.*;
public class Custom_Comparator 
{
    public static class Student implements Comparable<Student>
    {
        int age;
        double perc;
        String name;
        Student(int age,double perc ,String name)
        {
            this.age=age;
            this.perc=perc;
            this.name=name;
        }
        public int compareTo(Student s)
        {
            return this.name.charAt(0)-s.name.charAt(0);
        }
    }
    public static void print(Student[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].age+" "+s[i].perc+" "+s[i].name);
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Student[] s=new Student[4];
        s[0] = new Student(10, 20, "Bhagyadeep");
        s[1] = new Student(30, 40, "Aakash");
        s[2] = new Student(20, 30, "Abhinav");
        s[3] = new Student(40, 50, "Abhay");
        print(s);
        Arrays.sort(s);
        print(s);

    }
}
