package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet();
        hashSet.add("Andrey");
        hashSet.add("Larisa");
        hashSet.add("Pavel");
        hashSet.add("Kirill");
        hashSet.add("Maria");
        hashSet.add("Mikhail");
        hashSet.add("Alexey");
        hashSet.add("Larisa");//дубликат не отражается в выводе

        System.out.println(hashSet);
        System.out.println(hashSet.contains("Maria"));
        System.out.println(hashSet.contains("Marina"));
        System.out.println(hashSet.isEmpty());

    //union - объединение множеств

        Set<String> hashSet1 = new HashSet();

        hashSet1.add("Pavel");
        hashSet1.add("Andrey Jr");
        hashSet1.add("Gregory");
        hashSet1.add("Kirill");
        hashSet1.add("Maria");
        hashSet1.add("Yusouf");
        hashSet1.add("Mikhail");
        hashSet1.add("Yasya");
        hashSet1.add("Alexey");

        Set<String> union = new HashSet<>(hashSet);
        union.addAll(hashSet1);
        System.out.println(union);

        //intersection - пересечение множеств

        Set<String> intersection = new HashSet<>(hashSet);
        intersection.retainAll( hashSet1);
        System.out.println(intersection);

        //difference - разность множеств
        Set<String> difference = new HashSet<>(hashSet);
        difference.removeAll(hashSet1);
        System.out.println(difference);
    }

}
