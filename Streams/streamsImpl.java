package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsImpl {

    public static void main(String[] args) {
        List<Integer> listStream = Arrays.asList(1,2,3);
        Stream<Integer> stream = listStream.stream();


        Integer[] intList = {299,43,543,2};
        Stream<Integer> integerStream = Arrays.stream(intList);

        Stream<Integer> staticStream = Stream.of(3,45,6);


        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(3).add(4);
        Stream<Integer> streamFromBuilder = streamBuilder.build();


        Stream<Integer> iteratedStream = Stream.iterate(100 , (Integer o) -> o + 25).limit(10);


        Stream<Integer> concatedStream = Stream.concat(integerStream , staticStream);


        List<Integer> finalRes = stream.filter((Integer e) -> (e >2)).collect(Collectors.toList());
        List<Integer> integerStreamcollector = integerStream.collect(Collectors.toList());
        //List<Integer> staticStreamCollector = staticStream.collect(Collectors.toList());
        List<Integer> builderStreamCollector = streamFromBuilder.collect(Collectors.toList());


        System.out.println(integerStreamcollector);
        //System.out.println(staticStreamCollector);
        System.out.println(builderStreamCollector);
        System.out.println(iteratedStream);
        System.out.println(finalRes);




    }
}
