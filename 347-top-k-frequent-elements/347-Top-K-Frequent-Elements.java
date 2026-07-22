class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
            int key=entry.getKey();
            int value=entry.getValue();

            pq.offer(new int[]{value,key});
        }

        int[] ans=new int[k];
        int i=0;
        while(k-->0){
            int temp[] =pq.poll();
            ans[i++]=temp[1];
        }
        return ans;
        
    }
}