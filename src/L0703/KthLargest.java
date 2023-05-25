package L0703;

import java.util.PriorityQueue;

/***
 * Kth Largest Element in a Stream
 * @author 2008017
 *
 */
public class KthLargest {
	
	 PriorityQueue<Integer> pq;
	    int k=0;
	    public KthLargest(int k, int[] nums) {
	        this.k = k;
	        pq = new PriorityQueue<>();
	        for(int i: nums) {
	            this.add(i); // call class's own function, instead of repeating yourself
	        }
	    }
	    
	    public int add(int val) {
	        pq.add(val);
	        if(pq.size()>k) { // remove elements ONLY when heap size is too big
	            pq.remove();
	        }
	        return pq.peek();
	    }
	
}
