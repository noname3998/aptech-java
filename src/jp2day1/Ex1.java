package jp2day1;

import java.util.*;

public class Ex1 {

    public static void sortArrayList(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }

    public static void findMaxElement(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        int max = Collections.max(list);
        System.out.println("Maximum element: " + max);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("ArrayList after removing duplicates: " + list);
    }

    public static void linkedListOperations() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.addFirst("Zero");
        linkedList.addLast("Fourth");
        System.out.println("LinkedList after additions: " + linkedList);

        linkedList.remove("Second");
        linkedList.removeFirst();
        System.out.println("LinkedList after removals: " + linkedList);

        System.out.print("Iterating LinkedList: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void findIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);
    }

    public static void shuffleArrayList(ArrayList<Integer> list) {
        Collections.shuffle(list);
        System.out.println("Shuffled ArrayList: " + list);
    }

    public static void findSecondLargest(ArrayList<Integer> list) {
        if (list.size() < 2) {
            System.out.println("List has less than 2 elements");
            return;
        }
        TreeSet<Integer> set = new TreeSet<>(list);
        if (set.size() < 2) {
            System.out.println("All elements are same");
            return;
        }
        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }

    public static void findFrequency(ArrayList<Integer> list) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of elements: " + frequencyMap);
    }

    public static void findKthSmallest(ArrayList<Integer> list, int k) {
        if (k <= 0 || k > list.size()) {
            System.out.println("Invalid k value");
            return;
        }
        Collections.sort(list);
        System.out.println("Kth smallest element (k=" + k + "): " + list.get(k - 1));
    }

    public static void mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        System.out.println("Merged ArrayList: " + merged);
    }

    public static void findIntersectionMultipleSets(Set<Integer>... sets) {
        if (sets.length == 0) {
            System.out.println("No sets provided");
            return;
        }
        Set<Integer> intersection = new HashSet<>(sets[0]);
        for (int i = 1; i < sets.length; i++) {
            intersection.retainAll(sets[i]);
        }
        System.out.println("Intersection of multiple sets: " + intersection);
    }

    public static void checkLinkedListsEqual(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        boolean isEqual = list1.equals(list2);
        System.out.println("LinkedLists are equal: " + isEqual);
    }

    public static void checkSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Set1 is subset of Set2: " + isSubset);
    }

    public static void main(String[] args) {
        System.out.println("1. Sort ArrayList of Strings");
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Zebra", "Apple", "Mango", "Banana"));
        sortArrayList(stringList);

        System.out.println("\nFind Maximum Element");
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        findMaxElement(intList);

        System.out.println("\nRemove Duplicates");
        ArrayList<Integer> dupList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        removeDuplicates(dupList);

        System.out.println("\nLinkedList Operations");
        linkedListOperations();

        System.out.println("\nFind Intersection of Two ArrayLists");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        findIntersection(list1, list2);

        System.out.println("\nShuffle ArrayList");
        ArrayList<Integer> shuffleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        shuffleArrayList(shuffleList);

        System.out.println("\nFind Second Largest Element");
        ArrayList<Integer> largeList = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15));
        findSecondLargest(largeList);

        System.out.println("\nFind Frequency of Elements");
        ArrayList<Integer> freqList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        findFrequency(freqList);

        System.out.println("\nFind Kth Smallest Element");
        ArrayList<Integer> kthList = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        findKthSmallest(kthList, 3);

        System.out.println("\nMerge Two ArrayLists");
        ArrayList<Integer> mergeList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> mergeList2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        mergeArrayLists(mergeList1, mergeList2);

        System.out.println("\nFind Intersection of Multiple Sets");
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(4, 5, 8, 9));
        findIntersectionMultipleSets(set1, set2, set3);

        System.out.println("\nCheck if LinkedLists are Equal");
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        checkLinkedListsEqual(linkedList1, linkedList2);

        System.out.println("\nCheck if HashSet is Subset");
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        checkSubset(hashSet1, hashSet2);
    }
}
