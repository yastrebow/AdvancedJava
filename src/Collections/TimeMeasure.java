package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 // измеряем быстродействие ArrayList и LinkedList
public class TimeMeasure {
   public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>(); //создали ArrayList
       List<Integer> linkedList = new LinkedList<>();//создали LinkedList

       measureTime(arrayList);
       measureTime(linkedList);
   }
   //создаем метод измерения времени
   public static void measureTime(List<Integer> list){

           long start = System.currentTimeMillis();//время начала операции

       //добавление 100 000 элементов (в конец списка - по умолчанию)
           // for(int i = 0; i < 100000; i++) {
         //   list.add(i);  //для метода get() ArrayList - 12 ms; LinkedList - 8 ms

                //добавление 100 000 элементов в начало списка
                for(int i = 0; i < 100000; i++) {
                    list.add(0, i);  //для метода get() ArrayList - 1026 ms; LinkedList - 11 ms


                    //перебор элементов
                //for(int i = 0; i < 100000; i++){
             //  list.get(i); //для метода get() ArrayList - 3 ms; LinkedList - 3580 ms
           }
           long end = System.currentTimeMillis();//время окончания операции

           System.out.println(end - start);
       }

}
