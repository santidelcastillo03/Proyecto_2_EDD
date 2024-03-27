/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author Santiago del Castillo
 * @param <T>
 */
public class DynamicArray<T> implements Iterable<T> {
    private Object[] data;
    private int size;

    /**
     *
     */
    public DynamicArray() {
        data = new Object[1];
        size = 0;
    }
    
    private void checkCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            Object[] oldData = data;
            data = new Object[minCapacity];
            System.arraycopy(oldData, 0, data, 0, size); //copia el array
        }
    }
    
    /**
     *adds an element
     * @author Santiago del Castillo
     * @param element
     */
    public void add(Object element) {
        if (size == data.length) {
            checkCapacity(2 * data.length);
        }
        data[size++] = element;
    }

    /**
     *removes an element
     * @author Santiago del Castillo
     * @param index
     */
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        while (index < size - 1) {
            data[index] = data[index + 1];
            index++;
        }
        size--;
    }

    /**
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    /**
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * iterates, necessary when creating a dynamic array from scratch
     *@author Santiago del Castillo
     * @return
     */
    @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int currentIndex = 0;

                @Override
                public boolean hasNext() {
                    return currentIndex < size && data[currentIndex] != null;
                }

                @Override
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    return (T) data[currentIndex++];
                }
            };
        }
}
