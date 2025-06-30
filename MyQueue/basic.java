package MyQueue;  
import java.util.*;
import java.util.Queue;
public class basic {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();  // Removes 1
        System.out.println(q.peek());  // Prints 2
        System.out.println(q);         // Prints [2, 3, 4]
    }
}
