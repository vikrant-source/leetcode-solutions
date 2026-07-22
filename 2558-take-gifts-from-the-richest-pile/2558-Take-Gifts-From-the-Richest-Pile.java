class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;

        for(int gift:gifts){
            pq.offer(gift);
            sum+=gift;
        }

        while(k-->0){
            int x=pq.poll();
            int y=(int)Math.sqrt(x);
            sum =sum-x+y;
            pq.offer(y);
        }

        return sum;
    }
}