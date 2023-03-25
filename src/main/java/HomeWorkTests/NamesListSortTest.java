package HomeWorkTests;

import HomeWork.task1.NamesListSort;

import java.util.ArrayList;
import java.util.List;

public class NamesListSortTest {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Petrov");
        names.add("Pankeev");
        names.add("Kulik");
        names.add("Savenko");
        names.add("Bukov");
        names.add("Ivanov");
        System.out.println("names = " + names);
        String result = NamesListSort.getNamesWithUnpairedIndex(names);
        System.out.println("result = " + result);


    }
}
