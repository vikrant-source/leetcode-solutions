class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
            map.put(score[i],i);
        }

        String[] ans=new String[score.length];
        int rank=1;

        while(!pq.isEmpty()){
            int curScore=pq.poll();
            int index=map.get(curScore);

            if(rank==1) ans[index]="Gold Medal";
            else if(rank==2) ans[index]="Silver Medal";
            else if(rank==3) ans[index]="Bronze Medal";
            else ans[index]=String.valueOf(rank);
            rank++;
        }
        return ans;
    }
}