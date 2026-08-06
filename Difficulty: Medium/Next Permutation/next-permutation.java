class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int pivot=-1;
        int pivot_index=-1;
        
        //find the pivot index where drop exists
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot=arr[i];
                pivot_index=i;
                break;
            }
        }
        
        if(pivot_index==-1)
        {
            reverse(arr,0,n-1);
            return;
        }
        
        //find the first greater element to pivot scan from last
        int great_index=-1;
        int great=-1;
        
        for(int i=n-1;i>=pivot_index;i--)
        {
            if(arr[i]>arr[pivot_index])
            {
                great=arr[i];
                great_index=i;
                break;
            }
        }
        
        //swap pivot and great
        swap(arr,pivot_index,great_index);
        //reverse from pivot_index+1 to n-1;
        reverse(arr,pivot_index+1,n-1);
    }
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    void reverse(int arr[],int left,int right)
    {
        
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        }
    }
}