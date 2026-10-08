class Solution {
    public int maxProfit(int[] prices) {
        

        int s=0;
        int e=1;
        int maxP=0;
       

        while(e<prices.length){

           if(prices[e]>prices[s]){
              maxP= Math.max(maxP,prices[e]-prices[s]);
           }else 
              s=e;
            
           e++;
           
        }

        return maxP;
    }
}
