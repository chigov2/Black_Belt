package main.java.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madamq";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversedIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while(iterator.hasNext() && reversedIterator.hasPrevious()){
            if (iterator.next() != reversedIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}
