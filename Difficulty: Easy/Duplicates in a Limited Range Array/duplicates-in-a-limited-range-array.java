class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer>freq=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:freq.entrySet())
        {
            if(entry.getValue()>1)
            {
                set.add(entry.getKey());
            }
        }
        
        return new ArrayList<>(set);
        
     
    }
}