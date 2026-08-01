class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);//sort the array
        if(n<4)
        {
            return result;
        }
        
        for(int i=0;i<n-3;i++)// set for first number
        {
            //skip duplicates for 'i'
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            
            for(int j=i+1;j<n-2;j++)
            {
                //skip duplicates for 'j'
                if(j>i+1 && arr[j]==arr[j-1])
                {
                    continue;
                }
                
                int left=j+1; int right=n-1;
                //[1,2,3,4] 1=arr[i], 2=arr[j],3=j+1=arr[left] ,4=n-1=arr[right]
                while(left<right)
                {
                    ArrayList<Integer>temp=new ArrayList<>();
                    long sum=(long)arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target)
                    {
                        temp.add(arr[i]);temp.add(arr[j]);
                        temp.add(arr[left]);temp.add(arr[right]);
                        
                        result.add(temp);
                        left++;
                        right--;
                        
                    while(left<right && arr[left]==arr[left-1])
                    
                       { //skip for duplicate in left
                       
                       left++;
                           
                       }
                    while(left<right && arr[right]==arr[right+1])
                    {
                     //usually we check previous value
                     //the previous used right value is at right+1
                     right--;
                     
                    }
                
                        
                   }
               
                    
                     else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
            
        }
        
        return result;
    }
}