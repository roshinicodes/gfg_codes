class Solution {
    public boolean sameProduct(int[] arr) {
        // code here
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int num = arr[i]*arr[j];
                if(set.contains(num)){
                    return true;
                }
                else{
                    set.add(num);
                }
            }
        }
        return false;
        
    }
}