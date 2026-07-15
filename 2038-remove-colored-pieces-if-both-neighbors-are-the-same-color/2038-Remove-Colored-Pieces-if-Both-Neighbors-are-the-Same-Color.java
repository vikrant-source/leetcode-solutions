class Solution {
    public boolean winnerOfGame(String colors) {
        int countA=0;
        int countB=0;
        int a=0;
        int b=0;
        if(colors.length()<3) return false;

        for(int i=0;i<colors.length();i++){
            char ch=colors.charAt(i);
            if(ch=='A'){
                countA++;
                countB=0;
                if(countA>=3) a++;
                
            }else{
                countB++;
                countA=0;
                if(countB>=3) b++;   
            }
        }

        return(a>b);
    }
}