package jp2day2;

import java.util.*;
import java.util.function.Predicate;

class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{key=" + key + ", value=" + value + "}";
    }
}

class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}

interface Repository<T> {
    void add(T item);

    T get(int id);
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}

class UserRepository implements Repository<User> {
    private Map<Integer, User> users;

    public UserRepository() {
        users = new HashMap<>();
    }

    @Override
    public void add(User item) {
        users.put(item.getId(), item);
    }

    @Override
    public User get(int id) {
        return users.get(id);
    }
}

public class Example {

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> void printList(List<T> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static <T extends Number & Comparable<T>> T min(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        T minValue = list.get(0);
        for (T item : list) {
            if (item.compareTo(minValue) < 0) {
                minValue = item;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println("1. Generic Box Class");
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        stringBox.printValue();

        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        intBox.printValue();

        System.out.println("\n2. Generic Swap Method");
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Before swap: " + Arrays.toString(numbers));
        swap(numbers, 1, 3);
        System.out.println("After swap: " + Arrays.toString(numbers));

        String[] words = { "Apple", "Banana", "Cherry" };
        System.out.println("Before swap: " + Arrays.toString(words));
        swap(words, 0, 2);
        System.out.println("After swap: " + Arrays.toString(words));

        System.out.println("\n3. Print List with Generic Method");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.print("Fruits: ");
        printList(fruits);

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        System.out.print("Numbers: ");
        printList(nums);

        System.out.println("\n4. Generic Pair Class");
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1);

        Pair<Integer, String> pair2 = new Pair<>(1, "First");
        System.out.println(pair2);

        System.out.println("\n5. Upper Bound - Sum Numbers");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumNumbers(integers));

        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of doubles: " + sumNumbers(doubles));

        System.out.println("\n6. Generic Filter");
        List<Integer> allNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filter(allNumbers, n -> n % 2 == 0);
        System.out.print("Even numbers: ");
        printList(evenNumbers);

        List<String> allWords = Arrays.asList("Apple", "Apricot", "Banana", "Avocado");
        List<String> aWords = filter(allWords, s -> s.startsWith("A"));
        System.out.print("Words starting with A: ");
        printList(aWords);

        System.out.println("\n7. Generic Stack");
        GenericStack<String> stack = new GenericStack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is empty: " + stack.isEmpty());

        System.out.println("\n8. Compare with Comparable - Max Method");
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Max of 'Apple' and 'Banana': " + max("Apple", "Banana"));
        System.out.println("Max of 3.14 and 2.71: " + max(3.14, 2.71));

        System.out.println("\n9. Wildcard Super - Add Numbers");
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.print("Numbers added: ");
        printList(numberList);

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.print("Objects added: ");
        printList(objectList);

        System.out.println("\n10. Generic Interface - Repository");
        UserRepository userRepo = new UserRepository();
        userRepo.add(new User(1, "Alice"));
        userRepo.add(new User(2, "Bob"));
        userRepo.add(new User(3, "Charlie"));

        System.out.println("User with id 1: " + userRepo.get(1));
        System.out.println("User with id 2: " + userRepo.get(2));

        System.out.println("\n11. Multiple Bounds - Min Method");
        List<Integer> intList = Arrays.asList(5, 2, 8, 1, 9, 3);
        System.out.println("Min of integers: " + min(intList));

        List<Double> doubleList = Arrays.asList(5.5, 2.2, 8.8, 1.1);
        System.out.println("Min of doubles: " + min(doubleList));
    }
}