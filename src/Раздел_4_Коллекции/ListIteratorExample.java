package Раздел_4_Коллекции;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println("list = " + list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("isPalindrome = " + isPalindrome);
    }

}
/*
ListIterator расширяет возможности простого итератора и в нём можно работать не только с каждым следующим элементом,
используя next(), но и с предыдущим тоже, используя метод previous()
Мы будем проверять String на палиндром он.
*/