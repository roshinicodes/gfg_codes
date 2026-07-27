class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        if(st.isEmpty())
        {
            st.push(x);
            return st;
        }
        
        int top=st.pop();
        insertAtBottom(st,x);
        st.push(top);
        
        return st;
        
        /* dry run
        st = {4,3,2,1,8}  8 is top x = 2
        1.method got called
        2.check stack is empty -> no
        pop 8
        insertatbottom(st,2)
        call waiting ->st.push(8);
        
        method called 
        check ->no
        pop 1
        insertatbottom(st,2)
         call waiting ->st.push(8);
          call waiting ->st.push(1);
          
            method called 
        check ->no
        pop 2
        insertatbottom(st,2)
         call waiting ->st.push(8);
          call waiting ->st.push(1);
          call waiting-> st.push(2);
          
            method called 
        check ->no
        pop 3
        insertatbottom(st,2)
         call waiting ->st.push(8);
          call waiting ->st.push(1);
          call waiting-> st.push(2);
          call waiting-> st.push(3);
          
          
              method called 
        check ->no
        pop 4
        insertatbottom(st,2)
         call waiting ->st.push(8);
          call waiting ->st.push(1);
          call waiting-> st.push(2);
          call waiting-> st.push(3);
          call waiting-> st.push(4);
          
          method called
          check-> yes
          insert at bottom 2
          return stack why if this is line not present stack will endlessly pop
          the top also
          
          so we returned stack and the method call waiting are executed so 
          the most recent call st.push(4) to st.push(8);
          got executed.
        */
        
    }
}