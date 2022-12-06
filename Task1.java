import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        AddStack();
        AddQueue();
    }
    public static void AddStack() {
        LinkedList<Integer> stack = new LinkedList<>();

        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i <= array.length; i++){
            stack.add(i);
        }
        System.out.println("Стэк с массивом: " + stack);
    }
    public static void AddQueue() {
        Queue<Integer> queue = new LinkedList<>();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 1; i <= array.length; i++){
            queue.add(i);
        }
        System.out.println("Стэк с очередью: " + queue);
        
        
    }
}