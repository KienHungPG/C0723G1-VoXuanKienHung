package ss10_DSA.bai_tap.trien_khai_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index:" + index + ", Size" + index);
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        E e = (E) elements[index];
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        }
        return e;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            size++;
        }
    }

    public Object clone() {
        MyList<E> temp = new MyList<>();
        temp.size = size;
        temp.elements = Arrays.copyOf(elements, size);
        return temp;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1){
                result.append(", ");
            }
        }
        return result.toString() + "]";
    }
}
