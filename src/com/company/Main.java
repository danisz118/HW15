package com.company;
/*
Создать список случайных чисел.
Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
 */


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static int SIZE = 10;
    public static int MIN = 20;
    public static int MAX = 30;

    public static void main(String[] args) {
        arrayAverage();
	// write your code here
    }

    private static void arrayAverage() {
        OptionalDouble result = IntStream.range(0,SIZE)
                .mapToObj(s-> ThreadLocalRandom.current().nextInt(MIN,MAX))
                .map(s->(int) Math.pow(s,2))
                .mapToInt(Integer::byteValue)
                .average();

        System.out.println(result);

    }
}
