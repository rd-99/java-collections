package QueueImpl;

/// use stack class to inplement stack
//use LinkedList to implement queue
// use arraydeque to impl. double-ended queue
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class DequeImpl {

    //FIFO queue
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.add(3); // can throw exception
        System.out.println(q.peek()); //1
        System.out.println(q.poll()); //1 -removes the front element of the queue
        System.out.println(q.peek()); // 2
        System.out.println(q.poll());
        System.out.println(q.remove()); //Will throw an exception if no ele
        System.out.println(q.isEmpty()); //



        /////STACK/////
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.peek();
        while(!st.isEmpty()){
            st.pop();
        }


        ///DEQUE//
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2); //dq = [2,1]

        dq.pollFirst();
        dq.offerLast(99);
        dq.pollLast();
        dq.pollFirst();
        dq.pollLast();


        ////PrirityQueue///
        PriorityQueue<StudentsMarksForPQ> pq = new PriorityQueue<>();
        pq.add(new StudentsMarksForPQ(1,2,3));
        pq.add(new StudentsMarksForPQ(4,6,9));
        pq.add(new StudentsMarksForPQ(11,22,33));

        ArrayList<StudentsMarksForPQ> polledMarks = new ArrayList<>();
        while (!pq.isEmpty()){
            polledMarks.add(pq.poll());
        }
        System.out.println(polledMarks);

        //Maths is the only criteria to compare
        PriorityQueue<StudentsMarksForPQ> pqwithMaths = new PriorityQueue<>(new Comparator<StudentsMarksForPQ>() {
            @Override
            public int compare(StudentsMarksForPQ o1, StudentsMarksForPQ o2) {
                //desc. order
                return o2.getMathsMarks() - o1.getMathsMarks();
            }
        });
        //PriorityQueue<StudentsMarksForPQ> pqwithMaths = new PriorityQueue<>((a,b) -> b-a);

        pqwithMaths.add(new StudentsMarksForPQ(1,2,3));
        pqwithMaths.add(new StudentsMarksForPQ(4,6,9));
        pqwithMaths.add(new StudentsMarksForPQ(11,22,33));

        ArrayList<StudentsMarksForPQ> polledMarksMaths = new ArrayList<>();
        while (!pqwithMaths.isEmpty()){
            polledMarksMaths.add(pqwithMaths.poll());
        }
        System.out.println(polledMarksMaths);


    }



}
