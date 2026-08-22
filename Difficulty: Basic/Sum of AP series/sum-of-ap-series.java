class Solution {
    public int sumOfAP(int n, int a, int d) {
        // code here
        double sn=n*(2*a+((n-1)*d))*0.5;
        
        return (int) sn;
    }
};