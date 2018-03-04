package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    String stringData = "My name is Kritika My name is Kritika";
    List<String> stringList = Arrays.asList(stringData.split("\\s+"));
    Map<String, Integer> wordCountMap = stringList.stream().collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

}
