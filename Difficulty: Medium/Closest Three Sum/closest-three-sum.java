class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        
        int mindiff=Integer.MAX_VALUE;
        int result=0;
        
        for(int i=0;i<n-2;i++)
        {
            int left=i+1; int right=n-1;
            while(left<right)
            {
                int currsum=arr[i]+arr[left]+arr[right];
                
                if(Math.abs(currsum-target)<mindiff)
                {
                    mindiff=Math.abs(currsum-target);
                    result=currsum;
                }
                
                else if(Math.abs(currsum-target)==mindiff)
                {
                    result=Math.max(result,currsum);
                }
                
                
                if(currsum<target)
                {
                    left++;
                }
                
                else
                {
                    right--;
                }
            }
        }
        
        return result;
    }
}