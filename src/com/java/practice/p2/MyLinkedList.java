package com.java.practice.p2;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value) {
        if (this.head == null)
            this.head = new Node(value);
        else {
            Node temp = this.head;

            while (temp.getNext() != null)
                temp = temp.getNext();

            temp.setNext(new Node(value));
        }

        size++;
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
    }
}
