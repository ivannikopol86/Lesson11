package HomeWorkTests;

import HomeWork.task2.RegressionNamesSort;

import java.util.ArrayList;
import java.util.List;

public class RegressionNamesSortTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Petrov");
        names.add("Pankeev");
        names.add("Kulik");
        names.add("Savenko");
        names.add("Bukov");
        names.add("Ivanov");
        String result = RegressionNamesSort.getRegressionNamesSortStringsInUppercase(names).toString();
        System.out.println("result = " + result);
    }
}
