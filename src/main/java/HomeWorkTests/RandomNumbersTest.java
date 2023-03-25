package HomeWorkTests;

import HomeWork.task4.RandomNumbers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbersTest {
    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11L;
        long m = 281474976710656L;

        Stream<Long> result = RandomNumbers.getNextNumber(a, c, m);
        System.out.println(result.limit(10).collect(Collectors.toList()));
    }
}
