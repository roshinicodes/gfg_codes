class Solution {
    public int maxWater(int arr[]) {
        // code here
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];
        
        int totalwater=0;
        int n=arr.length;
        
        //base case
        if(arr.length<=1)
        {
            return 0;
        }
        
        leftmax[0]=arr[0];
        for(int i=1;i<leftmax.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        
        //calculate total water
        
        for(int i=0;i<arr.length;i++)
        {
            totalwater=totalwater+Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        
        
        return totalwater;
        
        
    }
}
