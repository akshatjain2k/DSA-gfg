import java.util.Deque;
import java.util.LinkedList;

class MyDS {
    Deque<Integer> dq;

    MyDS() {
        dq = new LinkedList<Integer>();
    }

    void insertMin(int x) {
        dq.offerFirst(x);
    }

    void insertMax(int x) {
        dq.offerLast(x);
    }

    int getMin() {
        return dq.peekFirst();
    }

    int getMax() {
        return dq.peekLast();
    }

    int extractMin() {
        return dq.pollFirst();
    }
    int extractMax() {
        return dq.pollLast();
    }
    public static void main(String[] args) {
        MyDS ds = new MyDS();
        ds.insertMin(5);
        ds.insertMax(15);
        ds.insertMin(2);
        ds.insertMax(20);
        System.out.println(ds.extractMin());
    }
}