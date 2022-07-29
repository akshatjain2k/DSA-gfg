import java.util.LinkedList;
import java.util.Queue;
/*
 * Operations
 * offer(), poll(), peek() more prefeble than add() and remove()
 */
class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
