class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer>freq=new HashMap<>();
        
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:arr)
        {
            list.add(num);
        }
         
        Collections.sort(list,(a,b)->
        {
        
        int fa=freq.get(a);
        int fb=freq.get(b);
        if(fa!=fb)
        {
            return fb-fa;
        }
        return a-b;
        }
    );
    
    return list;
        
        
    }
}