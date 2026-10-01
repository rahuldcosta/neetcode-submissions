class Solution {
    public int longestConsecutive(int[] nums) {
        // 3,21,5,11,4,5,6
        Set<Integer> st = new HashSet<>();

        for(int n : nums){
            st.add(n);
        }
        int cnt=0;
        int maxC=0;
        for(int i : nums){
            cnt=0;
            if(!st.contains(i-1)){
               cnt++;
               int j=i;
               while(st.contains(j+1)){
                 cnt++;
                 j++;
               }
               maxC=Math.max(maxC,cnt);
               
            }
        }

        return maxC;
    }
}
