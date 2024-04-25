import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    // Добавляем номера в книгу
    public static void addNumber(String key, long value, Map<String, ArrayList<Long>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        }
        else {
            ArrayList<Long> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    // Печатаем список контактов
    public static void printBook(Map<String, ArrayList<Long>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(long el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Map<String, ArrayList<Long>> bookPhone = new HashMap<>();
        addNumber("Mariska Veresh", 3725, bookPhone);
        addNumber("Agnieska", 8934, bookPhone);
        addNumber("Agnieska", 978546585, bookPhone);
        addNumber("Northrop", 812356233, bookPhone);
        addNumber("Northrop", 787897768, bookPhone);
        printBook(bookPhone);
    }
}