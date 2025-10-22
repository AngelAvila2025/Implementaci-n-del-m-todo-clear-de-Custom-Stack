import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        addCapacity();
        this.data[top++] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("No se encuentran elementos de stack");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia y no puedes obtener ningun elemento");
            return null;
        }
        return (T) data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            pop();
        }
        System.out.println("Se eliminaron todos los elementos del stack");
    }

    public void addCapacity(){
        if (top == data.length) {
            int newCap = data.length * 2;
            data = Arrays.copyOf(data, newCap);
        }
    }

    @Override
    public void println() {
        if (isEmpty()) {
            System.out.println("Stack vacío");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i]);
            if (i < top - 1) {
                System.out.print(",    ");
            }
        }
        System.out.println();
    }
}