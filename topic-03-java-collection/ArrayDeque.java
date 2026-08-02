import java.util.ArrayDeque;

class ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Add elements to stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack: " + stack);

        // Access element from top of stack
        String element = stack.peek();
        System.out.println("Accessed Element: " + element);

        // Remove element from top of stack
        String removedElement = stack.pop();
        System.out.println("Removed Element: " + removedElement);
    }
}