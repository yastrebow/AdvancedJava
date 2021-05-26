package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap(); //HashMap внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //LinkedHashMap - внутри элементы коллекции по порядку их добавления
        Map<Integer, String> treeMap = new TreeMap<>(); //TreeMap -элементы коллекции отсортированы по ключу:
        //числа - от меньшего к большему, String - в лексико-графическом порядке
        // или в естественном порядке

        testMaps(hashMap);
        testMaps(linkedHashMap);
        testMaps(treeMap);
    }
    //создаем метод для тестирования/сравнения разных МАР-ов
    public static void testMaps(Map<Integer, String> map) {
        map.put(23, "Jordan");
        map.put(17, "Kharlamov");
        map.put(11, "Kerzhakov");
        map.put(99, "Lounyov");
        map.put(6, "Lovren");
        map.put(1111, "Yastrebov");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
