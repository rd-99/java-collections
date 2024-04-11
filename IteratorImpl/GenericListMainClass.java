package IteratorImpl;

import java.util.Iterator;

public class GenericListMainClass {
    public static void main(String[] args){
        GenericList<Integer> newlist = new GenericList<>();
        newlist.add(3);
        newlist.add(4);
        newlist.add(5);
        newlist.add(6);

        for(Object v : newlist){
            System.out.println(v);
        }
        Iterator iterator = newlist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
