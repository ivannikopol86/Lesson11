package HomeWork.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RegressionNamesSort {

    public static List<String> getRegressionNamesSortStringsInUppercase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
