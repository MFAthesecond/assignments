package week_11.Question_11_10;

import java.util.ArrayList;
import java.util.Collection;

public class Stack extends ArrayList<Object> {

    public Stack(int initialCapacity) {
        super(initialCapacity);
    }

    public Stack() {
    }

    public Stack(Collection<?> c) {
        super(c);
    }

    public boolean isEmpty() {
        return this.isEmpty();
    }

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        return this.pop();

    }

    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        String stack = "[";
        for (int i = 0; i < this.size(); i++) {
            stack = stack + this.get(i) + ", ";
        }
        return "stack: " + stack + "\b\b";
    }
}