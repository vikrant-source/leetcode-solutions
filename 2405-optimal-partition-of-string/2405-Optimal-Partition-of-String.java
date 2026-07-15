class Solution {
    public int partitionString(String s) {
        Set<Character>map=new HashSet<>();
        int count=1;
        for(char ch:s.toCharArray()){
            if(!map.add(ch)){
                count++;
                map.clear();
                map.add(ch);
            }
        }
        return count;
    }
}