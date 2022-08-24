package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listA = new ArrayList<>();
        System.out.println("Введите ваши любимые числа: ");
        Integer ListB = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Integer d = scanner.nextInt();
        Integer g = scanner.nextInt();
        listA.add(ListB);
        listA.add(b);
        listA.add(c);
        listA.add(d);
        listA.add(g);

        System.out.println(listA);


        ArrayList<Integer> listB = new ArrayList<>();
        System.out.println("Введите ваши НЕ любимые числа: ");
        Integer q = scanner.nextInt();
        Integer w = scanner.nextInt();
        Integer e = scanner.nextInt();
        Integer p = scanner.nextInt();
        Integer l = scanner.nextInt();
        listB.add(q);
        listB.add(w);
        listB.add(e);
        listB.add(p);
        listB.add(l);
        System.out.println(listB);


        System.out.println("_________________________________________-");
        Collections.reverse(listB);
        System.out.println(listB);

        Integer length = listA.size();
        ArrayList<String> listC = new ArrayList<String>(length);
        for (int i = 0; i < length; i++) {
            listC.add(listA.get(i) + ", " + listB.get(i));// здесь мы соединили 2 листа : listA , listB
        }

        System.out.println("----- Мы объединили ваши любимые и НЕ любимые числа:  ------1");
        System.out.println(listC);
    }
}
