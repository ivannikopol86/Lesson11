package HomeWork.task5;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMix {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        LinkedList<T> firstlinkedlist = first.collect(Collectors.toCollection(LinkedList::new));
        LinkedList<T> secondlinkedlist = second.collect(Collectors.toCollection(LinkedList::new));
        LinkedList<T> result = new LinkedList<>();
        while (!firstlinkedlist.isEmpty() && !secondlinkedlist.isEmpty()) {
            result.add(firstlinkedlist.poll());
            result.add(secondlinkedlist.poll());
        }
        return result.stream();
    }
}
