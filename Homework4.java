import java.util.*;




public class Homework4 {
    public static void main(String[] args)
    {
        
        List<String> list = new LinkedList<String>(); // создаем лист строк
  
       
        list.add("я"); // добавление элементов в лист 
        list.add("люблю");
        list.add("Java");
        list.add("Code");
  
        System.out.println("оригинал : " + list); //печатаем в консоль оригинал
  
        Collections.reverse(list); // используем коллекцию reverse
  
        System.out.println("перевернутый : " + list);
    }
}
