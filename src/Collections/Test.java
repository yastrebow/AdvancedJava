package Collections;

public class Test {

    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(17);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));

myLinkedList.remove(1);
System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
