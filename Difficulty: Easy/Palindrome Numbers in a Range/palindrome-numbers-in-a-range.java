class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=m;i<=n;i++)
        {
            if(ispalindrome(i))
            {
                list.add(i);
            }
        }
        
        return list;
        
    }
    
    public static boolean ispalindrome(int num)
    {
        int temp=num;
        int rev=0;
        
        while(temp>0)
        {
            int digits=temp%10;
            rev=rev*10+digits;
            temp=temp/10;
        }
        
        if(rev==num)
        {
            return true;
        }
        
        return false;
    }
}