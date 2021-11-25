package com.nccourses.mylinkedlist;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E> implements ILinkedList<E>{

    private int size = 0;

    private Node<E> first;

    private Node<E> last;

    private Node<E> nodeByIndex(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        if (index < (size >> 1)){
            Node<E> tmp = first;
            for(int i = 0; i != index; i++)
                tmp = tmp.next;
            return tmp;
        }
        else{
            Node<E> tmp = last;
            for(int i = size - 1; i != index; i--)
                tmp = tmp.prev;
            return tmp;
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node<E>(null, element, null);
            last = first;
        }
        else {
            last.next = new Node<E>(last, element, null);
            last = last.next;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));

        if (size == 0 || index == size){
            this.add(element);
            return;
        }
        if (index == 0){
            first.prev = new Node<E>(null, element, first);
            first = first.prev;
            size++;
            return;
        }

        Node<E> tmp = nodeByIndex(index);
        Node<E> insert = new Node<>(tmp.prev, element, tmp);
        tmp.prev.next = insert;
        tmp.prev = insert;
        size++;
    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        return nodeByIndex(index).item;
    }

    @Override
    public int indexOf(E element) {
        int ind = 0;
        if (element == null) {
            for (Node<E> tmp = first; tmp != null; tmp = tmp.next) {
                if (tmp.item == null)
                    return ind;
                ind++;
            }
        } else {
            for (Node<E> tmp = first; tmp != null; tmp = tmp.next) {
                if (element.equals(tmp.item))
                    return ind;
                ind++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));

        Node<E> tmp = nodeByIndex(index);
        if (size == 1){
            this.clear();
            return tmp.item;
        }
        if (index == 0){
            first = first.next;
            first.prev = null;
            size--;
            return tmp.item;
        }
        if (index == size - 1){
            last = last.prev;
            last.next = null;
            size--;
            return tmp.item;
        }

        E removeValue = tmp.item;
        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;
        size--;
        return removeValue;
    }

    @Override
    public E set(int index, E element) {

        Node<E> tmp = nodeByIndex(index);
        E oldVal = tmp.item;
        tmp.item = element;

        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] res = new Object[size];

        Node<E> tmp = first;
        for(int i = 0; i < size; i++){
            res[i] = tmp.item;
            tmp = tmp.next;
        }

        return res;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {

            MyLinkedList.Node<E> current = first;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                E elem = current.item;
                current = current.next;
                index++;
                return elem;
            }
        };

        return it;
    }



    @Override
    public String toString() {
        if (size == 0)
            return "[]";
        StringBuilder result = new StringBuilder("");
        Node<E> tmp = first;
        while (tmp != null){
            result.append(tmp.item + " ");
            tmp = tmp.next;
        }
        return result.toString();
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
