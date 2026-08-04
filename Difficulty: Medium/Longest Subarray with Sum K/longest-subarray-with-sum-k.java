class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int prefixsum=0;
        int maxlength=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        
        
        for(int i=0;i<arr.length;i++)
        {
            prefixsum=prefixsum+arr[i];
            
            if(map.containsKey(prefixsum-k))
            {
                int length=i-map.get(prefixsum-k);
                
                if(length>maxlength)
                {
                    maxlength=length;
                }
            }
            
            if(!map.containsKey(prefixsum))
            {
                map.put(prefixsum,i);
            }
            
        }
        
        return maxlength;
        
        
    }
}
