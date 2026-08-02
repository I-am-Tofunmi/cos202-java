import java.util.Stack;

class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Remove element from Stack	
        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        // Access element from top
        String element = animals.peek();
        System.out.println("Element at top: " + element);

        // search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        // Check if Stack is empty
        boolean result = animals.empty();
        System.out.println("Is Stack empty? " + result);
    }
}