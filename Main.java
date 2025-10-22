public class Main{
    public static void main(String[] args) {
        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.println();
        myStack.pop();
        myStack.println();
        System.out.println("\n--- Limpiando pila ---");
        myStack.clear();
        myStack.println();
    }
}