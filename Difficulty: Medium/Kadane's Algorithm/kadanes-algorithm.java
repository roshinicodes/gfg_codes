class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int curr_max=arr[0];
        int max_so_far=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
        
        return max_so_far;
    }
}
