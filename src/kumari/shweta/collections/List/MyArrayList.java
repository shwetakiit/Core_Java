package kumari.shweta.collections.List;

import java.util.Arrays;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elemtData[];

    MyArrayList() {
        this.elemtData = new Object[INITIAL_CAPACITY];
    }

    MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elemtData = new Object[initialCapacity];
    }

    // 1. Add element to the end of the list

    public boolean add(E element) {
        ensureCapacity();
        elemtData[size++] = element;
        return true;
    }


    //2 Find element

    public E get(int index) {
        rangeCheck(index);
        return (E) elemtData[index];
    }

    // 3 Remove element
    public E remove(int index) {
        rangeCheck(index);
        E removeElement = (E) elemtData[index];
        for (int i = index; i < size - 1; i++) {
            elemtData[i] = elemtData[i + 1];

        }
        size--;
        return removeElement;
    }

    //4 Check size of arraylist
    public int size() {
        return this.size;
    }

    //5 print list
    public void display(){
        System.out.print("[");
       for(int i=0;i<size;i++){

           System.out.print(i!=size-1? elemtData[i]+",":elemtData[i]);
       }
       System.out.print("]");
    }

    //Check capacity , If Capacity is full increase the  capacity
    private void ensureCapacity() {
        if (size == elemtData.length) {
            int oldCapacity = elemtData.length;
            int newCapacity = oldCapacity * 2;

            if (newCapacity <= oldCapacity) { //Hanlded ege case if oldcapacity was 0
                newCapacity = oldCapacity + 1;
            }
            elemtData = Arrays.copyOf(elemtData, newCapacity);
        }

    }

    // check index rang belong to  current array size or not.
    private void rangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
