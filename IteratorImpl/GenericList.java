package IteratorImpl;

import java.util.Iterator;
import java.util.function.Consumer;

public class GenericList<T> implements Iterable{
    private T[] list;
    private int size ;

    public GenericList(){
        size = 0;
        list = (T[]) new Object[100];
    }
    public void add(T item){
        list[size ++] = item;
    }


    @Override
    public Iterator iterator() {
        return new GenericListIteratorIMpl(this);
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    private class GenericListIteratorIMpl implements Iterator<T>{
        private GenericList<T> dList;
        private Integer index;
        public GenericListIteratorIMpl(GenericList<T> list){
            this.dList = list;
        }

        @Override
        public boolean hasNext() {
            return index < dList.size;
        }

        @Override
        public T next() {
            return dList.list[index ++];
        }
    }
}


