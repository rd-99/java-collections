package ListImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListImpl {

    public static void main(String[] args){
        List<Integer> aList = new ArrayList<>();
        List<Integer> blist =  new ArrayList<>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        System.out.println(aList);

        blist.add(4);
        blist.add(5);

        aList.addAll(1,blist); //by default addAll index is -1
        System.out.println(aList + "after adding");

        int r = aList.indexOf(2);
        int rr = aList.lastIndexOf(2);
        System.out.println(r +""+ rr);

        List<Integer> sublist = aList.subList(1,3);
        int initalValueAtThatIndex = sublist.set(1,33);


        LinkedList<Integer> implNextAndPrev = new LinkedList<>();
        implNextAndPrev.add(11);
        implNextAndPrev.add(22);
        implNextAndPrev.add(33);

        ListIterator<Integer> iterator = implNextAndPrev.listIterator();

        System.out.println(iterator.next()); //11
        System.out.println(iterator.next()); //22
        System.out.println(iterator.previous()); //22
        //Inshort .next is implemented as arr[index ++] & .previous is implemeted as arr[-- index]
        //Vector is similar to Array but thread-safe and slightly slow.

        Integer[] arr = blist.toArray(new Integer[0]);


    }

    private void add(int i) {
    }

}
