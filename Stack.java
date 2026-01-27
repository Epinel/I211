import java.util.ArrayList;

public class Stack<E> extends ArrayList<E> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public E peek() {
        return super.get(getSize()-1);
    }

    public E pop() {
       return super.remove(getSize()-1);
        
    }

    public void push(E element) {
        super.add(element);
    }

    @Override
    public String toString() {
        return "stack: "+super.toString();
    }
}
