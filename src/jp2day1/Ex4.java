package jp2day1;

import java.util.*;

public class Ex4 {

    public static void implementStackWithStackClass() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Peek top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is stack empty now? " + stack.isEmpty());
    }

    public static void implementStackWithLinkedList() {
        LinkedList<String> stack = new LinkedList<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");

        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Peek top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is stack empty now? " + stack.isEmpty());
    }

    public static void implementStackWithArrayDeque() {
        ArrayDeque<Double> stack = new ArrayDeque<>();

        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);

        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Peek top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is stack empty now? " + stack.isEmpty());
    }

    public static void implementStackWithPriorityQueue() {
        class StackElement {
            int value;
            long insertionOrder;

            StackElement(int value, long insertionOrder) {
                this.value = value;
                this.insertionOrder = insertionOrder;
            }

            @Override
            public String toString() {
                return String.valueOf(value);
            }
        }

        PriorityQueue<StackElement> stack = new PriorityQueue<>(
                new Comparator<StackElement>() {
                    @Override
                    public int compare(StackElement e1, StackElement e2) {
                        return Long.compare(e2.insertionOrder, e1.insertionOrder);
                    }
                });

        long order = 0;
        stack.offer(new StackElement(100, order++));
        stack.offer(new StackElement(200, order++));
        stack.offer(new StackElement(300, order++));
        stack.offer(new StackElement(400, order++));
        stack.offer(new StackElement(500, order++));

        System.out.println("Stack size: " + stack.size());
        System.out.println("Peek top element: " + stack.peek());

        System.out.println("\nPopping elements (LIFO order):");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.poll());
        }

        System.out.println("Is stack empty now? " + stack.isEmpty());
    }

    public static void demonstrateStackOperations() {
        Stack<Character> stack = new Stack<>();
        String expression = "HELLO";

        System.out.println("Original string: " + expression);

        for (char ch : expression.toCharArray()) {
            stack.push(ch);
        }

        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void balancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println("Expression: " + str);
        System.out.println("Balanced: " + balanced);
    }

    public static void main(String[] args) {
        System.out.println("1. Stack Implementation using Stack Class");
        implementStackWithStackClass();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("2. Stack Implementation using LinkedList Class");
        implementStackWithLinkedList();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("3. Stack Implementation using ArrayDeque Class");
        implementStackWithArrayDeque();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("4. Stack Implementation using PriorityQueue with Custom Comparator");
        implementStackWithPriorityQueue();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("Bonus: String Reversal using Stack");
        demonstrateStackOperations();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("Bonus: Balanced Parentheses Check");
        balancedParentheses("{[()]}");
        balancedParentheses("{[(])}");
        balancedParentheses("((()))");
        balancedParentheses("(()");
    }
}
