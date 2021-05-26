package Collections;

import java.util.*;

//проверяем работу контракта hashMap()/equals()

public class MyHashCodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
    /*
    map.put(1, "Jack");
    map.put(1, "another Jack");//значение элемента с ключом 1 перезаписано

    set.add(1);
    set.add(1);//значения 1 считаются за одно значение
        System.out.println(map);
        System.out.println(set);
    }
    */
        //создаем два объекта класса Person
        Person person1 = new Person(1, "Larisa");
        //Person person2 = new Person(2, "Andrey");
        Person person2 = new Person(1, "Larisa");//даже в таком случае person1 и 2 воспринимаются, как разные объекты (new)
        //{Person{id=1, name='Larisa'}=Somebody, Person{id=1, name='Larisa'}=Someone}
        //[Person{id=1, name='Larisa'}, Person{id=1, name='Larisa'}]
        //чтобы этого не было надо переопределить методы hashcode() и equals() в классе Person

        //добавим эти объекты в качестве ключей в наши МАП и СЕТ
        map.put(person1, "Somebody");
        map.put(person2, "Someone");
        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
    //создадим класс, чтобы отправить его объект в качестве ключей в МАП и СЕТ
    static class Person {
        private int id;
        private String name;

        @Override
        public String toString() {//переопределяем метод toString, чтобы он выдавал строковое значение нашего класса Person
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Person(int id, String name) {//создaем конструктор метода, принимающий в качестве аргументов значения наших переменных
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
