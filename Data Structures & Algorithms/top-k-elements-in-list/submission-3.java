class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mapping= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mapping.put(nums[i],mapping.getOrDefault(nums[i],0)+1);
        }
        System.out.println(mapping);
        PriorityQueue<int[]> que= new PriorityQueue<>((a,b)-> a[0]-b[0]);

        for(Map.Entry<Integer,Integer> entry: mapping.entrySet()){
            que.offer(new int[]{entry.getValue(),entry.getKey()});
        if(que.size()>k){
            que.poll();
        }
        
        }

        // System.out.println(que.poll()[1]);
        int[] result= new int[k];
        for(int i=0;i<k;i++){
            result[i]=que.poll()[1];
        }

        return result;
    }
}
