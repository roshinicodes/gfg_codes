class Solution {
    public String convert(String s) {
        // code here
        char arr[]=s.toCharArray();
        
        arr[0]=Character.toUpperCase(arr[0]);
        
        for(int i=1;i< s.length();i++)
        {
            if(arr[i]==' ')
            {
                if(i+1 <s.length())
                {
                    arr[i+1]=Character.toUpperCase(arr[i+1]);
                
                }
            }
        }
        
        return new String(arr);
    }
};