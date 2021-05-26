package Collections;


//Односвязный LinkedList с целыми числами

import java.util.ArrayList;
import java.util.Arrays;

public class MyLinkedList {
    private Node head; // головной узел
    private int size; // задали переменную для размера нашего списка; автоматом ей присваивается 0

    public void add(int value) {
        if (head == null) { //если это первое добавление элемента в список
            this.head = new Node(value); //нашему нулевому узлу присваиваем переданное значение
        } else {
            Node tmp = head; //создаем временный узел и ссылаем его на головной узел; теперь на head - две ссылки
            while (tmp.getNext() != null) { //пока значение следующего (по отношению к tmp) узла (tmp.getNext) не НУЛЛ
                tmp = tmp.getNext(); //переходим к следю узлу
            }
            tmp.setNext(new Node(value)); //после того как дошли до конца списка (tmp - последний элемент),
            // создаем следующий узел и присваиваем ему переданное значение
        }
        size++; // инкременируем размер листа
    }

    public int get(int index) {
        int currentIndex = 0; // создаем переменную "текущий индекс"
        Node tmp = head; // головной узел
        while (tmp != null) { //пока узлы в списке есть
            if (currentIndex == index) { //если переданное значение равно текущему индексу
                return tmp.getValue(); //возвращаем значение узла
            } else {
                tmp = tmp.getNext();//переходим к следю узлу
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();//if index > size
    }

    public void remove(int index){
        //чтобы удалить первый элемент списка (элемент с индексом 0)
        if (index == 0){ //если переданный индекс = 0
            head = head.getNext(); //мы переопределяем элемент head, смещая его на один элемент вперед, тем самым удаляя первый элемент списка
            size--; //уменьшаем список
            return; //выходим
        }
        int currentIndex = 0;
        Node tmp = head;
        while (tmp != null) {
            if(currentIndex == index - 1) { //если мы дошли до искомого элемента
                tmp.setNext(tmp.getNext().getNext());
                /* устанавливаем ему связь на элемент "через один"
                т.е. если в списке [1] -> [2] -> [3] удаляем элемент с индексом 1 ([2]), то
                для элемента 0 переписываем связь [1] -> [2] на [1] -> [3]  */
                size --;
                return;
            }else
            {
                tmp = tmp.getNext();
                currentIndex++;
            }
        }

    }

    public String toString() { //метод для вывода/просмотра нашего списка.
        //для этого мы должны пройтись по списку, записать куда-то данные из списка и вывести их
        int[] result = new int[size]; //создаем массив
        int index = 0; //задаем начальный индекс
        Node tmp = head; //временный узел
        while (tmp != null) { //пока значение узла не НУЛЛ (пока есть узлы в списке)
            result[index++] = tmp.getValue();// значение текущего узла добавляем в массив
            //result[index++] - то же самое, что и:
            // result[index] = tmp.getValue();
            // index++
            tmp = tmp.getNext();//переходим на следующий узел
        }
        return Arrays.toString(result);
    }

    private static class Node { // класс для описания узлов
        private int value; // значение текущего узла
        private Node next; // наш список односвязный, поэтому указываем на следующий узел

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
