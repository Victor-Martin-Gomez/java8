package org.edu.personal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by esdmnv on 20/11/2017.
 */
public class StreamAPIs {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 80);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High numbers parallel=" + p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 80);
        highNumsSeq.forEach(p -> System.out.println("High numbers sequential=" + p));

    }

}
