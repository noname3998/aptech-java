package jp2day1;

import java.util.*;

public class Ex2 {

    public static void createAndPrintHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        System.out.println("HashSet elements:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }

    public static void checkElementExists(HashSet<Integer> hashSet, int element) {
        if (hashSet.contains(element)) {
            System.out.println(element + " exists in the HashSet");
        } else {
            System.out.println(element + " does not exist in the HashSet");
        }
    }

    public static void createCountryCapitalMap() {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Australia", "Canberra");

        System.out.println("Country-Capital Mappings:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nCapital of Japan: " + countryCapitalMap.get("Japan"));
    }

    public static void findCommonElements(ArrayList<String> list1, ArrayList<String> list2) {
        HashSet<String> set1 = new HashSet<>(list1);
        HashSet<String> set2 = new HashSet<>(list2);

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }

    public static void createWordFrequencyTreeMap(String text) {
        TreeMap<String, Integer> wordFrequency = new TreeMap<>();

        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequencies (sorted by word):");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void checkSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Set1 is a subset of Set2: " + isSubset);
    }

    public static void main(String[] args) {
        System.out.println("Create and Print HashSet");
        createAndPrintHashSet();

        System.out.println("\nCheck if Element Exists in HashSet");
        HashSet<Integer> numberSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("HashSet: " + numberSet);
        checkElementExists(numberSet, 30);
        checkElementExists(numberSet, 60);

        System.out.println("\nHashMap - Country to Capital Mappings");
        createCountryCapitalMap();

        System.out.println("\nFind Common Elements Between Two ArrayLists");
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Date", "Elderberry", "Fig"));
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        findCommonElements(list1, list2);

        System.out.println("\nTreeMap - Word Frequency in Text");
        String sampleText = "Java is a programming language. Java is widely used. Programming in Java is fun.";
        System.out.println("Text: " + sampleText);
        createWordFrequencyTreeMap(sampleText);

        System.out.println("\nCheck if HashSet is Subset");
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        checkSubset(set1, set2);

        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 7));
        System.out.println("\nSet 3: " + set3);
        System.out.println("Set 2: " + set2);
        checkSubset(set3, set2);
    }
}
