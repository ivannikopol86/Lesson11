package HomeWorkTests;

import HomeWork.task5.StreamsMix;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMixTest {
    public static void main(String[] args) {

        Stream<String> FIRST_LIST = Stream.of("In", "Domini", "et", "et", "Sancti", "*");
        Stream<String> SECOND_LIST = Stream.of("nomine", "Patris", "Filii", "Spiritus", "!");

        Stream<String> print = StreamsMix.zip(FIRST_LIST, SECOND_LIST);
        System.out.println(print.collect(Collectors.toList()));
    }
}
