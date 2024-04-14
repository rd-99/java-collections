package SetImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetImpl {
    public static void main(String[] args){
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

    }
}
