package Exercice.SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //MAP ключ и стойност

        // 1. Hash map работи много бързо но при обхождане на структурата подава елементите в разбъркан ред
        // хешираща функция отговаря за записването на ключовете и стойностите в структурата като взема ключа и го превърща в число
        // entry = key + value

        //Map<String, Integer> grade = new HashMap<>();

        // 2.LinkedHashMap работу бързо и пази данните си в реда в който сме ги запазили
        // хешираща функция отговаря за записването на ключовете и стойностите в структурата като взема ключа и го превърща в число
        // entry = key + value + previous + next

        //LinkedHashMap<String, Integer> gradeUsingLinkedHashMap = new LinkedHashMap<>();

        // 3.TreeMap работи бързо и елементите ги пази в сортиран ред
        // използва дървоводна структура
        // entry = key + value + left + right

        //TreeMap<String, Integer> gradeUsingTreeMap = new TreeMap<>();

        // sorting
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Boris", 3);
        map.put("Andrei", 4);
        map.put("Pesho", 5);

        map.entrySet().stream().sorted(
                (left, right) -> {
                    int result = left.getValue() - right.getValue();


                    if (result == 0) {
                        result = left.getKey().compareTo(right.getKey());
                    }
                    return result;
                }

        ).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}