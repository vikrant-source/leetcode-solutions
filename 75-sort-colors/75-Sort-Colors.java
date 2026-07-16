class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count0=0;
        int count1=0;

        for (int x:nums) {
            if(x==0)count0++;
            else if(x==1)count1++;
        }

        int i=0;
        while(count0-->0) nums[i++]=0;
        while(count1-->0) nums[i++]=1;
        while(i<n) nums[i++]=2;
        
    }
}