package SetImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

/*
Common methods

add()
addAll(Collection<? extends E> c)
clear()
contains(Object o)
containsAll(Collection<?> c)
equals()
hashCode()
isEmpty()
remove()
removeAll(Collection<?> c)
retainAll(Collection<?> c) //retains only the elements contained in the passed argument
size()
toArray()

*/


public class HashSetImpl {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        ///HashSet
        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(2);
        System.out.println(a);//[1,2]
        a.remove(2);
        a.clear();
        System.out.println(a); // empty

        HashSet<Integer> aa = new HashSet<>();
        HashSet<Integer> bb = new HashSet<>();
        aa.add(1);
        aa.add(2);
        bb.add(2);
        bb.add(3);
        aa.retainAll(bb); // intersection of aa&&bb in aa, bb remains unchanged
        System.out.println(aa + " =a " + bb + " =b" );
        aa.add(44);
        aa.removeAll(bb); //same as above but exclusion
        //Union
        aa.addAll(bb);

        //Linked Hash Set -- for maintaining the insertion order
        HashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.addAll(aa);


        //TreeSet
            //Synchorized
            SortedSet<Integer> s = Collections.synchronizedSortedSet(new TreeSet<Integer>());

            //Unsynchronized
            TreeSet<Integer> intTreeSet = new TreeSet<>(new HashSet<Integer>());
            intTreeSet.add(3);
            intTreeSet.remove(3);
            intTreeSet.ceiling(999); //returns least element >= 999 , 1000 if present /// null if no such num.
            intTreeSet.floor(1000); // returns 999 if present , null if no num. <= 1000
            intTreeSet.contains(2);
            Object cloned = intTreeSet.clone(); //clone returns Object


            ///See these elements
            int lowestElementOfSet = intTreeSet.first();
            int largestElementOfSet = intTreeSet.last();

            //poll
            int lowestElementOfSetRemoved = intTreeSet.pollFirst();
            int largestElementOfSetRemoved = intTreeSet.pollLast();

            //LinkedHashSet - HashSet and linkedList impl. , maintains order based on insertion of ele. while iterating
                            //re-insertion does not affect order , no additional cost like treeset
            HashSet<Integer> linkedHashSet = new LinkedHashSet<>();




    }
}
