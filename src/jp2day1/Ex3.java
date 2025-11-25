package jp2day1;

import java.util.*;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

class Task {
    String taskName;
    int priority;

    Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return taskName + " [Priority: " + priority + "]";
    }
}

public class Ex3 {

    public static void implementBasicPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println("Elements in sorted order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void implementPriorityQueueWithStrings() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Zebra");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Banana");
        pq.add("Cherry");

        System.out.println("String elements in sorted order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void implementPriorityQueueWithCustomComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println("Elements in descending order (custom comparator):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void implementPriorityQueueWithObjects() {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.grade - s1.grade;
            }
        });

        pq.add(new Student("Alice", 85));
        pq.add(new Student("Bob", 92));
        pq.add(new Student("Charlie", 78));
        pq.add(new Student("David", 95));
        pq.add(new Student("Eve", 88));

        System.out.println("Students sorted by grade (highest first):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void implementQueueWithCustomComparator() {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.priority - t2.priority;
            }
        });

        taskQueue.offer(new Task("Write Report", 3));
        taskQueue.offer(new Task("Fix Bug", 1));
        taskQueue.offer(new Task("Review Code", 2));
        taskQueue.offer(new Task("Update Documentation", 4));
        taskQueue.offer(new Task("Deploy Application", 1));

        System.out.println("Processing tasks by priority (lowest priority number first):");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }

    public static void implementStackWithCustomComparator() {
        PriorityQueue<Integer> stackLikePQ = new PriorityQueue<>(new Comparator<Integer>() {
            private Map<Integer, Integer> insertionOrder = new HashMap<>();
            private int counter = 0;

            @Override
            public int compare(Integer a, Integer b) {
                insertionOrder.putIfAbsent(a, counter++);
                insertionOrder.putIfAbsent(b, counter++);
                return insertionOrder.get(b) - insertionOrder.get(a);
            }
        });

        stackLikePQ.add(10);
        stackLikePQ.add(20);
        stackLikePQ.add(30);
        stackLikePQ.add(40);
        stackLikePQ.add(50);

        System.out.println("Stack-like behavior (LIFO using PriorityQueue):");
        while (!stackLikePQ.isEmpty()) {
            System.out.println(stackLikePQ.poll());
        }
    }

    public static void implementStackWithTimestamp() {
        class TimestampedElement {
            int value;
            long timestamp;

            TimestampedElement(int value, long timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }

            @Override
            public String toString() {
                return String.valueOf(value);
            }
        }

        PriorityQueue<TimestampedElement> stackPQ = new PriorityQueue<>(
                new Comparator<TimestampedElement>() {
                    @Override
                    public int compare(TimestampedElement e1, TimestampedElement e2) {
                        return Long.compare(e2.timestamp, e1.timestamp);
                    }
                });

        long time = 0;
        stackPQ.add(new TimestampedElement(10, time++));
        stackPQ.add(new TimestampedElement(20, time++));
        stackPQ.add(new TimestampedElement(30, time++));
        stackPQ.add(new TimestampedElement(40, time++));
        stackPQ.add(new TimestampedElement(50, time++));

        System.out.println("Stack with timestamp-based ordering:");
        while (!stackPQ.isEmpty()) {
            System.out.println(stackPQ.poll());
        }
    }

    public static void main(String[] args) {
        System.out.println("Basic PriorityQueue with Integers");
        implementBasicPriorityQueue();

        System.out.println("\nPriorityQueue with Strings");
        implementPriorityQueueWithStrings();

        System.out.println("\nPriorityQueue with Custom Comparator (Descending Order)");
        implementPriorityQueueWithCustomComparator();

        System.out.println("\nPriorityQueue with Custom Objects and Comparator");
        implementPriorityQueueWithObjects();

        System.out.println("\nQueue with Custom Comparator (Task Priority)");
        implementQueueWithCustomComparator();

        System.out.println("\nStack-like Behavior with PriorityQueue (Timestamp-based)");
        implementStackWithTimestamp();
    }
}
