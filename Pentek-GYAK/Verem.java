import java.util.ArrayList;
import java.util.List;

public class Verem {
    private List<Integer> data;

    public Verem() {
        this.data = new ArrayList<>();
    }

    public int size() {
        return this.data.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push (int value) {
        this.data.add(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int e : this.data) {
            sb.append(e);
            sb.append(' ');
        }
        return sb.toString();
    }

    public int pop() {
        int lastIndex = this.size() -1;
        int result = this.data.get(lastIndex);
        this.data.removeLast();

        return result;

    }
}
