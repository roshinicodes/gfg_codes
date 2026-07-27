class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer>temp=new Stack<>();
        
        while(!st.isEmpty())
        //repeat these steps until the original stack becomes empty
        {
            int curr=st.pop();
           

                while(!temp.isEmpty() && temp.peek()<curr)
                {
                    int s=temp.pop();
                    st.push(s);
                }
            
            
            temp.push(curr);
        }
        
        
        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
        
    }
}