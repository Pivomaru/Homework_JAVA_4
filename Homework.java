import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

/**
 * Homework
 */

public class Homework {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        List<String> storage = new LinkedList<>(); // []
        while (true) {
        String command = sc.next();
        String[] args = command.split("~"); // string~4
        if (args.length != 2) {
        throw new IllegalArgumentException();
        }
        
        String string = args[0];
        String num = args[1];
        int number = Integer.parseInt(num);
        
        int size = storage.size();
        if (size < number) {
        int left = number - size;
        for (int i = left; i >= 0; i--) {
        storage.add("null");
        }
        }
        
        storage.set(number, string);
        
       
        }
    }
}