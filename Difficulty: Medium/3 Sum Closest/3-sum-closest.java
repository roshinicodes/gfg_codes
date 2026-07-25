class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        
        //1.sort the array
        //2.find n equal array len
        //3.assign mindiff as max
        //4. for loop to i=o ->n-2
        //5.initialize left and right
        
        int n=arr.length;
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        int result=0;
        
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            
            while(left<right)
            {
                int currsum=arr[i]+arr[left]+arr[right];
                
                if(Math.abs(currsum-target)<mindiff)
                {
                    mindiff=Math.abs(currsum-target);
                    result=currsum;
                }
                
                // return the maximum value currsum -target==mindiff
                
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