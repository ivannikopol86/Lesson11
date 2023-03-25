package HomeWork.task4;

import java.util.stream.Stream;

public class RandomNumbers {




    public static Stream<Long> getNextNumber(long a, long c, long m) {


        return Stream.iterate(0L, x -> (a * x + c) % m);
    }
}
