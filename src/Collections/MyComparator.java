package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//отсортируем элементы коллекции при помощи Comparator'а

public class MyComparator {
    public static void main(String[] args) {
        //отсортируем коллекции с помощью метода sort класса Collections

        //List<String> names = new ArrayList<>();
//
        //names.add("Jordan");
        //names.add("Kharlamov");
        //names.add("Kerzhakov");
        //names.add("Lounyov");
        //names.add("Lovren");
        //names.add("Yastrebov");
//
        //Collections.sort(names, new StringLengthComparator());//второй аргумент - из нашего Компаратора
        //System.out.println(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(11);
        numbers.add(17);
        numbers.add(6);
        numbers.add(99);
        numbers.add(57);

        Collections.sort(numbers, new BackwardsIntegerComparator());//аналогично - второй аргумент из Компаратора
        System.out.println(numbers);
    }
}
    //для реализации собственной логики сортировки String-листа создаем класс,
    // в котором реализуем интерфейс Comparator
       //class StringLengthComparator implements Comparator<String> {

       ////переопределяем метод compare интерфейса Comparator
       //@Override
       ///* конвенция метода compare:
       //o1 > o2 => return 1
       //o1 < o2 => return -1
       //o1 == o2 => return 0
       // */
       //public int compare(String o1, String o2) {
       //    if (o1.length() > o2.length()) {
       //        return 1;
       //    }
       //    else if (o1.length() < o2.length()) {
       //        return -1;
       //    } else {
       //        return 0;
       //    }
       //}
//}

//для реализации собственной логики сортировки Integer-листа создаем класс,
// в котором реализуем интерфейс Comparator
class BackwardsIntegerComparator implements Comparator<Integer> {

    //переопределяем метод compare интерфейса Comparator
    @Override
        /* конвенция метода compare:
        o1 > o2 => return 1
        o1 < o2 => return -1
        o1 == o2 => return 0
         */
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
