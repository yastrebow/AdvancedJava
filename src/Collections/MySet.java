package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet(); // внутри не гарантируется никакого порядка
        Set<String> linkedHashSet = new LinkedHashSet<>(); //внутри элементы коллекции по порядку их добавления
        Set<String> treeSet = new TreeSet<>(); //элементы коллекции отсортированы по порядку:
        //числа - от меньшего к большему, String - в лексико-графическом порядке (в естественном порядке)

        hashSet.add("Andrey");
        hashSet.add("Larisa");
        hashSet.add("Pavel");
        hashSet.add("Kirill");
        hashSet.add("Maria");
        hashSet.add("Mikhail");
        hashSet.add("Alexey");

        for(String name : hashSet)
        System.out.println(name);

        linkedHashSet.add("Andrey");
        linkedHashSet.add("Larisa");
        linkedHashSet.add("Pavel");
        linkedHashSet.add("Kirill");
        linkedHashSet.add("Maria");
        linkedHashSet.add("Mikhail");
        linkedHashSet.add("Alexey");

        for(String name : linkedHashSet)
            System.out.println(name);

        treeSet.add("Andrey");
        treeSet.add("Larisa");
        treeSet.add("Pavel");
        treeSet.add("Kirill");
        treeSet.add("Maria");
        treeSet.add("Mikhail");
        treeSet.add("Alexey");

        for(String name : treeSet)
            System.out.println(name);
    }
}
