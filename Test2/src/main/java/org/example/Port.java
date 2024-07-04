package org.example;
import java.util.*;

public class Port {
    public static void main(String[] args) {
        Methods methods = new Methods();
        String[] indexes = {"[1,3-5]", "[2]", "[3-4]"};

        System.out.println("Массив строк в изначальном виде: " + Arrays.toString(indexes));
        List<List<Integer>> split = methods.splitIndexes(indexes);
        System.out.println("Масив чисел из массива строк: " + split);
        List<List<Integer>> comb = methods.pairsNum(split);
        System.out.println("Все возможные пары последовательности чисел: " + comb);
    }
}