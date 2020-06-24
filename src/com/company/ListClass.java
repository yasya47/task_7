package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {

    public LinkedList<Integer> list = new LinkedList<>();

    static int quantityItems;

    public ListClass(int quantityItems) {
        ListClass.quantityItems = quantityItems;
    }

    public void addItems() {

        for (int i = 0; i < quantityItems; i++) {
            if (i % 2 == 0) list.add(i);
            else list.addFirst(i);
        }
        System.out.println(list);
    }

    public void removalItems() {
        for (int j = 0; j <= quantityItems; j++) {
            if (j % 2 == 0) System.out.println(list.pollLast());
            else System.out.println(list.pollFirst());

        }
        System.out.println(list);
    }

    public void addJenga() {
        for (int i = 0; i < quantityItems; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public void jenga() {
        // не могу поять почему вытаскивать начинает только с рандомного индекса
        int index = (int) (1 + Math.random() * quantityItems);
        System.out.println(index);
        for (int i = 0; i < quantityItems; i++) {
            list.add(list.remove(index));
        }
        System.out.println(list);
    }

}
