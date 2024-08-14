import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<? super T>> implements Iterable<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> previous;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            Node<T> current = head;
            while (current != null && current.data.compareTo(value) < 0) {
                current = current.next;
            }
            if (current == null) {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            } else {
                if (current.previous != null) {
                    current.previous.next = newNode;
                    newNode.previous = current.previous;
                } else {
                    head = newNode;
                }
                newNode.next = current;
                current.previous = newNode;
            }
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }
        size--;
        return current.data;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public int indexOf(T value) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public Iterator<T> reverseIterator() {
        return new Iterator<T>() {
            private Node<T> current = tail;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.previous;
                return data;
            }
        };
    }

    public LinkedList<T> below(T value) {
        LinkedList<T> result = new LinkedList<>();
        Node<T> current = head;
        while (current != null && current.data.compareTo(value) <= 0) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    public LinkedList<T> above(T value) {
        LinkedList<T> result = new LinkedList<>();
        Node<T> current = head;
        while (current != null && current.data.compareTo(value) >= 0) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }




}


