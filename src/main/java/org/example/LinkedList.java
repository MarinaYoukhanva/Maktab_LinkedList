package org.example;

public class LinkedList<T> {

    private class Node {
        private T info;
        private Node next;

        private Node() {
            info = null;
            next = null;
        }
    }

    private Node start;
    private Node end;
    private Node previous;
    private int size;

    public LinkedList() {
        start = null;
        end = null;
        previous = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addAsFirst(T value) {
        Node node = new Node();
        node.info = value;
        node.next = start;
        start = node;
        if (size == 0)
            end = start;
        size++;
    }

    public void addAsLast(T value) {
        Node node = new Node();
        node.info = value;
        //previous = end;
        if (end != null)
            end.next = node;
        end = node;
        if (size == 0)
            start = node;
        size++;
    }

    public void removeFirst() {
        try {
            start = start.next;
            size--;
        } catch (NullPointerException e) {
            throw new RuntimeException("List is empty");
        }
    }

    public void removeLast() {
        if (isEmpty())
            throw new RuntimeException("List is empty");
        previous = findPrevious();
        if (previous == null)
            start = null;
        if (previous != null)
            previous.next = null;
        end = previous;
        size--;
    }

    public void remove(int index) {
        Node node = findNode(index);
        Node previous = findNode(index - 1);
        if (index == 0)
            removeFirst();
        else {
            previous.next = node.next;
            node.next = null;
        }

    }

    public void show() {
        Node currentNode = start;
        while (currentNode != null) {
            System.out.print(currentNode.info + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean contains(T value) {
        if (isEmpty())
            throw new RuntimeException("List is empty");
        Node currentNode = start;
        for (int i = 0; i < size; i++) {
            if (currentNode.info.equals(value))
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public T find(int index) {
        return findNode(index).info;
    }

    public void add(int index, T value) {
    }

    private Node findNode(int index) {
        if (isEmpty())
            throw new RuntimeException("List is empty");
        Node currentNode = start;
        int i = 0;
        while (i < index) {
            try {
                currentNode = currentNode.next;
            } catch (NullPointerException e) {
                throw new RuntimeException("this index is out of bounds");
            }
            i++;
        }
        return currentNode;
    }

    private Node findPrevious() {
        if (isEmpty())
            return null;
        Node currentNode = start;
        try {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode;
        } catch (NullPointerException e) {
            return null;
        }
    }


}
