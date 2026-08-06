class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        
        int a=0;
        int b=n-1;
        
        while(a<b)
        {
            if(mat[a][b]==1)
            {
                //a knows b so a cant be the celebrity
                a++;
            }
            else if(mat[a][b]==0)
            {
                //a doesn't know b ,so b cant be the celebrity
                b--;
            }
        }
        
        //when a==b
        int candidate=a;
          for (int i = 0; i < n; i++) {
            if (i == candidate) continue;
            
            // candidate should not know anyone (row must be 0)
            // everyone should know candidate (column must be 1)
            if (mat[candidate][i] != 0 || mat[i][candidate] != 1) {
                return -1;
            }
        }
        
        return candidate;
        
    }
}