package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class examples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1" , "3" , "5" , "7");
        IntStream intStream = stringList.stream().mapToInt(Integer::parseInt);
        int[] ans = intStream.toArray();
        System.out.println(Arrays.toString(ans));

        List<String> longStream = Arrays.asList("3" , "6" , "4");
        LongStream q = longStream.stream().filter((String s) -> s.length() < 5).mapToLong(Long::parseLong);
        System.out.println((Arrays.toString(q.toArray())));
    }
}
