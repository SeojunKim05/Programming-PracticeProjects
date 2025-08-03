package lab02$arraylists;

import utils.List;

/*****************************************************************
 * This class ArrayList implements a contiguous block of data
 * using an array.
 *
 * TODO : Please Complete the Following
 *        1. Comment all steps in your methods used for its
 *           implementation. Be clear and precise.
 *        2. Your comments must clearly explain the step to
 *           the satisfaction of the instructor (in brief).
 *        3. Use JavaDoc Comments above each method.
 *****************************************************************/

public class ArrayList<E> implements List<E>{
	private int size;
	private E[] data;
	private static final int DEFAULT_CAPACITY = 10;
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	public ArrayList(int capacity) {
		if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        // Initializing the data array with Object type and casting it to E[]
        data = (E[]) new Object[capacity];
        size = 0; // Initializing size to 0
	}

    public boolean add(E item) {
        ensureCapacity(size + 1);
        data[size++] = item;
        return true;
    }

    public void add(int index, E item) {
        checkIndex(index);
        ensureCapacity(size + 1);
        shiftRight(index);
        data[index] = item;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    @SuppressWarnings("unchecked")
    public void ensureCapacity(int targetCapacity) {
        if (targetCapacity > data.length) {
            int newCapacity = Math.max(data.length * 2, targetCapacity);
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if (data[i] != null && data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E remove(int index) {
    	if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        checkIndex(index);
        E removedItem = data[index];
        shiftLeft(index);
        size--;
        return removedItem;
    }

    public boolean remove(E item) {
        int index = indexOf(item);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public E set(int index, E item) {
    	if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        checkIndex(index);
        E oldItem = data[index];
        data[index] = item;
        return oldItem;
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
    }

    private void shiftRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
