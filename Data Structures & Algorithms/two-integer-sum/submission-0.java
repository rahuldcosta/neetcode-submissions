class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numbs= new HashMap<>();
           numbs.put(nums[0],0);
           if(nums.length==2)
           return new int[]{0,1};
        for(int i=1 ; i< nums.length;i++){
           
           if(numbs.containsKey(target-nums[i])){
              return new int[] {numbs.get(target-nums[i]),i};
           }
           numbs.put(nums[i],i);
        }
        return new int[]{};
    }
}
