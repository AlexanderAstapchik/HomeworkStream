package com.company.lesson14;

import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> wordStream;
        Stream.of(" dad","dog"," level","cat","noon","magic","Deed")
                .filter(element->element.trim()
                        .equalsIgnoreCase(new StringBuffer(element.trim())
                                .reverse().toString()))
             //   .filter(element-> Objects.equalsIgnoreCase(element, new StringBuffer(element).reverse().toString()))
                .forEach(System.out::println);
    }
}
