class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max= Arrays.stream(piles).max().getAsInt();
        int l=1;
        int r=max;
        int res=max;

        while(l<=r){
            int mid=(l+r)/2;
            long timeneeded=0;
            for(int pile : piles){
            timeneeded+= Math.ceil((double)pile/mid);
            }
        
            if(timeneeded<=h){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        return res;
    }
}
