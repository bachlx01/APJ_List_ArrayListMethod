import java.util.Arrays;

import java.util.Arrays;
public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 5;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        this.size = size;
        element = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add (E element) {
        if (size == this.element.length) {
            ensureCapa();
        }
        this.element[size] = element;
        this.size++;
    }

    public void add (int index, E element) {
        if (size == this.element.length) {
            ensureCapa();
        }
        for (int i = this.element.length-1; i >index ; i--) {
            this.element[i] = this.element[i-1];
        }
        this.element[index] = (E) element;
        this.size++;
    }

    public E remove (int index) {
        E valueOf = (E) this.element[index];
        for (int i = index; i < this.element.length-1; i++) {
            this.element[i] = this.element[i+1];
        }
        if (this.size>0) this.size--;
        return valueOf;
    }

    public E[] clone () {
        E clone = (E) this.element;
        return (E[]) clone;
    }

    public boolean constant (E e){
        boolean constant = false;
        for (Object element :
                this.element) {
        if (e == element) constant = true;
        break;
        }
        return constant;
    }

    public int indexOf (E o) {
        int index = -1;
        for (int i = 0; i < this.element.length; i++) {
            if (this.element[i] == o) {
                index = i;
            }
        }
        return index;
    }

    public E get (int i){
        return (E)this.element[i];
    }

    public void clear () {
        this.element = new Object[DEFAULT_CAPACITY];
    }



    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < this.size; i++) {
            if (i < this.size-1) {
                result += this.element[i] + "; ";
            } else {
                result += this.element[i];
            }
        }
        result += "]";
        return result;
    }
}
