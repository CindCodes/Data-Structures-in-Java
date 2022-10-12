import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class maxQueue {
    public static void enqueue(int a, Deque<Integer> Main_Queue, Deque<Integer> Max_Queue) {
        Main_Queue.add(a);
        while(true) {
            if(Max_Queue.size() > 0) {
                int x = Max_Queue.getLast();
                if(x < a) {  
                    Max_Queue.pollLast();
                }
                else {
                    Max_Queue.add(a);
                    break;
                }
            }
            else {
                Max_Queue.add(a);
                break;
            }
        }
    }
    public static void dequeue(Deque<Integer> Main_Queue, Deque<Integer> Max_Queue) {
        int polled;
        if(Main_Queue.size() > 0) {
            polled = Main_Queue.pollFirst();
            if(polled == Max_Queue.peek()) {
                Max_Queue.pollFirst();
            }
        }
    }
    public static void printQueue(Deque<Integer> Main_Queue, Deque<Integer> Max_Queue) {
        System.out.println("Max Queue: ");
        for(int element : Max_Queue) {
            System.out.println(element);
        }
        System.out.println("Main Queue: ");
        for(int element : Main_Queue) {
            System.out.println(element);
        }
    }
	public static void main(String[] args)
	{
        Deque<Integer> Main_Queue = new LinkedList<>();
        Deque<Integer> Max_Queue = new LinkedList<>();
        Scanner user= new Scanner(System.in); 
        System.out.print("Enter your selected numbers - ");  
        int a= user.nextInt();
        int b= user.nextInt();
        int c= user.nextInt();
        int d= user.nextInt();
        user.close();
        
        enqueue(a, Main_Queue, Max_Queue);
        enqueue(b, Main_Queue, Max_Queue);
        enqueue(c, Main_Queue, Max_Queue);
        enqueue(d, Main_Queue, Max_Queue);
        dequeue(Main_Queue, Max_Queue);
        dequeue(Main_Queue, Max_Queue);
        printQueue(Main_Queue, Max_Queue);
        user.close();
	}
}
