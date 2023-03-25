package HomeWork.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NamesListSort {

    public static String getNamesWithUnpairedIndex(List<String> names) {
        return IntStream
                .range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> String.format("%d. %s", i, names.get(i)))
                .collect(Collectors.joining(", "));
    }
}
