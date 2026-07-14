class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=costs[0];

        for(int i=1;i<costs.length;i++) {
            if(costs[i]>max) {
                max=costs[i];
            }
        }

        int[] freq=new int[max+1];

        for(int cost:costs){
            freq[cost]++;
        }

        int t=0;
        for(int cost=1;cost<=max;cost++){
            if(freq[cost]==0){
                continue;
            }
            if(coins<cost){
                break;
            }

            int canBuy=Math.min(freq[cost],coins/cost);
            t+=canBuy;
            coins-=canBuy*cost;
        }

        return t;

    }
}