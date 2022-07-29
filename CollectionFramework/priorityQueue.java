import java.util.Comparator;
import java.util.PriorityQueue;

class priorityQueue {
    public static void main(String[] args) {

        // Works as Min Heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Work as Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(80);
        pq.offer(10);

        System.out.println(pq);
        pq.poll(); // max priority least number
        System.out.println(pq);
        // System.out.println(pq.peek()); // print which is next to remove

    }
}
