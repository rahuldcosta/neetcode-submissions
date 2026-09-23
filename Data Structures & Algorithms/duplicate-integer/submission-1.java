class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
         freq.putIfAbsent(nums[i],freq.getOrDefault(nums[i],0));
         freq.put(nums[i],freq.get(nums[i])+1);
         if(freq.get(nums[i])%2==0){
            return true;
         }
        }

        return false;
    }
}