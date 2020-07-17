/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

import singlylinkedlistexample.SList;

/**
 *
 * @author Enubs
 */
public class LinkedStack<E> implements Stack<E> {
    private final SList<E> list;

    public LinkedStack(){
        list = new SList<>();
    }
    
    
    @Override
    public E push(E e) {
        list.addFirst((E)e);
        return e;
    }

    @Override
    public E pop() {
        E e = (E)list.first();
        list.removeFirst();
        return e;
    }

    @Override
    public E top() {
        return (E) list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
