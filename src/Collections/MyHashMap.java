package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyHashMap {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap(); //HashMap внутри не гарантируется никакого порядка

        hashMap.put(0, "Dog");
        hashMap.put(1, "Cat");
        hashMap.put(2, "Shark");
        hashMap.put(3, "Beaver");
        hashMap.put(4, "Bear");
        System.out.println(hashMap);

        hashMap.put(1, "No Cat, but Tiger");//значение перезаписывается
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));//вывод значения по ключу
        System.out.println(hashMap.get(10));//элемента с таким ключом нет, выводит null

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {//перебор всех пар "ключ-значение"
            // (Map.Entry<Integer, String> entry, где entry - имя)
            //hashMap.entrySet() возвращает набор всех пар (все entry, имеющиеся в hashMap)
            System.out.println(entry.getKey() + " : " + entry.getValue()); //вызов у элементов entry ключей и значений
            // и вывод их в консоль
        }
        //HashMap не гарантирует вывода элементов коллекции по порядку
    }
}

