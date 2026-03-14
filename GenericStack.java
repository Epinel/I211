import java.util.ArrayList;

public class GenericStack<e> extends ArrayList<e> {

    public int getSize() {
        return size();
    }

    public e peek() {
        return get(size()-1);
    }

    public void push (e o) {
        add(o);
    }

    public e pop() {
        e o = get(size()-1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }
}
