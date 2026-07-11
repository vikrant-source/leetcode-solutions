class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>map=new HashSet<>();
        HashSet<Integer>ans=new HashSet<>();
        for(int x:nums1){
            map.add(x);
        }

        for(int x:nums2){
            if(map.contains(x)) ans.add(x);
        }
        
        int[] res=new int[ans.size()];

        int i=0;
        for(int num:ans){
            res[i++]=num;
        }

        return res;
    }
}