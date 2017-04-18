//CMPT 220
//Author: Daniel Gisolfi
//Date: 4.18.17
//lab 10

//13.3

import java.util.ArrayList;
import java.util.Random;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = generateRandomArray(10);
        System.out.println("Original list");
        System.out.println(list);
        sort(list);
        System.out.println("After Sorting");
        System.out.println(list);

    }

    private static ArrayList<Number> generateRandomArray(int size) {
        ArrayList<Number> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }
        return list;
    }

    public static void sort(ArrayList<Number> list) {
            boolean sorted;
            Number temp;
            do {
                sorted = true;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
                        temp = list.remove(i);
                        list.add(i + 1, temp);
                        sorted = false;
                    }
                }
            } while (!sorted);

    }
}