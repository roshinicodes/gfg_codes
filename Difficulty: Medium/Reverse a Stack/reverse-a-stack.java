class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        /* simple analogy 8 4 1 2 , 8 is top
        how to reverse simple like remove the top element insert at bottom
        remove the top insert at bottom
        
        
        so like this we are going to call;*/
        if(st.isEmpty())
        {
            return ;//as the given method is void;
        }
        
        int top=st.pop();//remove the top element
        reverseStack(st);//recursive call
        insertAtBottom(st,top);//insert at bottom
    }
    
    public static Stack<Integer> insertAtBottom(Stack<Integer>st,int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return st;
        }
        
        int top=st.pop();
        insertAtBottom(st,x);
        st.push(top);
        return st;
    }
}
