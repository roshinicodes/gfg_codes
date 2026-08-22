class Solution {
    public List<Integer> primeRange(int l, int r) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=l;i<=r;i++)
        {
            if(isprime(i))
            {
                list.add(i);
            }
        }
        
        return list;
    }
    
    public static boolean isprime(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}