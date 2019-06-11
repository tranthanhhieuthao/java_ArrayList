import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (this.size == elements.length) {
            ensureCapa();
        }
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E getdata(int i) {
        return (E) elements[i];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    public Object clone(){
        return clone();
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i])) return true;
            return false;
    }

    public int indexOf(E element){
        for (int i=0;i<size;i++){
            if (element.equals(elements[i])) return i;
        }
        return -1;
    }

    public boolean add(E element){
        return contains(element);
    }

    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i + ", size" + i);
        }
        return (E) elements[i];
    }

    public void clear(){
    elements =(E[]) new Object[DEFAULT_CAPACITY];
    size =0;
    }
}
