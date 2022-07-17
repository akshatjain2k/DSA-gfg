import java.util.ArrayDeque;

class arrDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(25);       // add in queue
        ad.offerFirst(15);  // add in first 
        ad.offerLast(35);   // add in last
        ad.offer(26);

        System.out.println(ad);

        // System.out.println(ad.peek());
        // System.out.println(ad.peekFirst());
        // System.out.println(ad.peekLast());

        System.out.println(ad.poll());
        System.out.println("Poll() " + ad);

        System.out.println(ad.pollFirst());
        System.out.println("PollFirst() "+ad);

        System.out.println(ad.pollLast());
        System.out.println("PollLast() "+ad);
        
    }
}
