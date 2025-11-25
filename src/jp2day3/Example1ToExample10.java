package jp2day3;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Example1ToExample10 {

    public static void sumTwoNumbers() {
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        int result1 = sum.apply(10, 20);
        int result2 = sum.apply(50, 75);
        int result3 = sum.apply(100, 200);

        System.out.println("Sum of 10 and 20: " + result1);
        System.out.println("Sum of 50 and 75: " + result2);
        System.out.println("Sum of 100 and 200: " + result3);
    }

    public static void convertStrings() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toLowerCase = str -> str.toLowerCase();

        System.out.println("Original list: " + names);

        List<String> upperCaseList = names.stream()
                .map(toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperCaseList);

        List<String> lowerCaseList = names.stream()
                .map(toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCaseList);
    }

    public static void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }

    public static void filterOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isOdd = num -> num % 2 != 0;

        List<Integer> oddNumbers = numbers.stream()
                .filter(isOdd)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static void checkEmptyString() {
        Predicate<String> isEmpty = str -> str.isEmpty();

        String str1 = "";
        String str2 = "Hello";
        String str3 = "   ";

        System.out.println("'" + str1 + "' is empty: " + isEmpty.test(str1));
        System.out.println("'" + str2 + "' is empty: " + isEmpty.test(str2));
        System.out.println("'" + str3 + "' is empty: " + isEmpty.test(str3));

        Predicate<String> isBlank = str -> str.trim().isEmpty();
        System.out.println("'" + str3 + "' is blank: " + isBlank.test(str3));
    }

    public static void calculateAverage() {
        List<Double> numbers = Arrays.asList(10.5, 20.3, 30.7, 40.2, 50.9);

        double average = numbers.stream()
                .mapToDouble(num -> num)
                .average()
                .orElse(0.0);

        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
    }

    public static void removeDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8, 1);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("After removing duplicates: " + uniqueNumbers);
    }

    public static void sortStrings() {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry", "Date");

        List<String> sortedAsc = fruits.stream()
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());

        List<String> sortedDesc = fruits.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Original list: " + fruits);
        System.out.println("Sorted ascending: " + sortedAsc);
        System.out.println("Sorted descending: " + sortedDesc);
    }

    public static void sumEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of even numbers: " + sumEven);
    }

    public static void sumOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOdd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(num -> num)
                .sum();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

    public static void main(String[] args) {
        System.out.println("Sum");
        sumTwoNumbers();

        System.out.println("\nTrans char");
        convertStrings();

        System.out.println("\nEven");
        filterEvenNumbers();

        System.out.println("\nOdd");
        filterOddNumbers();

        System.out.println("\nEmpty String");
        checkEmptyString();

        System.out.println("\nAvg");
        calculateAverage();

        System.out.println("\nDuplicate");
        removeDuplicates();

        System.out.println("\nSort String");
        sortStrings();

        System.out.println("\nSum Even Numbers");
        sumEvenNumbers();

        System.out.println("\nSum Odd Numbers");
        sumOddNumbers();
    }
}