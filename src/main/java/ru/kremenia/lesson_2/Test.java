package ru.kremenia.lesson_2;

public class Test {

    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList<>();
        arrayList.add("Moscow");
        arrayList.add("Minsk");
        arrayList.add("London");
        arrayList.add("Berlin",2);
        System.out.println(arrayList);
        arrayList.delete(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));

        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Moscow");
        myLinkedList.add("Minsk");
        myLinkedList.add("London");
        myLinkedList.add(1,"Berlin");
        System.out.println(myLinkedList.get(1));
        myLinkedList.delete(3);
        System.out.println(myLinkedList.get(2));
    }
}
