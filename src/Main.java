// array -> static
// linked list -> dynamic
// int[] arr = new int(5)

// Last element always shows null, so we can understand that we found the last element by it.

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(5);
        stack.push(3);
        int x = stack.peek();
        System.out.println(x);
        stack.isEmpty();
        stack.size();

    }
}