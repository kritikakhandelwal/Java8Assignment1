package edu.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListMultiplication {
    public static  List<Integer> ListMultiplication(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        IntStream.range(0, list1.size()).forEach(index -> result.add(list1.get(index) * list2.get(index)));
        return result;
    }
}
