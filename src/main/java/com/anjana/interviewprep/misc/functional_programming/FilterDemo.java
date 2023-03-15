package com.anjana.interviewprep.misc.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer evenDoubledNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2).findFirst().get();

        Optional<Integer> evenNumberFound = numbers.stream()
                .filter(n -> n%2==0)
                .findAny();

        /*
        allMatch() is a terminal operation in Java streams that returns true if
        all elements of the stream match the given predicate, or false otherwise.
        It can be useful in situations where you need to check whether all elements
        of the stream satisfy a certain condition
         */
       boolean allEvenNumbers = numbers.stream()
                .allMatch(n-> n>0);

        System.out.println(evenDoubledNumbers);
        System.out.println(evenNumberFound.isPresent());
        System.out.println(evenNumberFound.get());
        System.out.println(allEvenNumbers);


    }
}
