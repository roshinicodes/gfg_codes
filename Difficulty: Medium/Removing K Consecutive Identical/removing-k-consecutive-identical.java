class Solution {
    
       static class pair
        {
            char st_ch;
            int count;
            
            pair(char st_ch,int count)
            {
                this.st_ch=st_ch;
                this.count=count;
            }
        }
        
    public String reducedString(int k, String s) {
        // code here
        Stack<pair>st=new Stack<>();
        if (k == 1)
          {
             return "";
          }
        
        for(char ch:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek().st_ch==ch)
            {
                st.peek().count++;
                
                if(st.peek().count==k)
                {
                    st.pop();
                }
            }
            
            else
            {
                st.push(new pair(ch,1));
            }
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(pair p:st)
        {
            for(int i=0;i<p.count;i++)
            {
                ans.append(p.st_ch);
            }
        }
        
        return ans.toString();
        
    }
}