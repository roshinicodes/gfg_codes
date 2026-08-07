class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        //list kulla array add panna porom
        //antha list la first array

        int[] mergedarr = arr[0];
        // atha comparison start aagapothu
        //so atha fix panni add pannikirom

        result.add(mergedarr);

        for (int i = 1; i < arr.length; i++) {

            //now we going to compare [0,1]|| [a,b][c,d]  b and c
            //if b>c change b as c

            int curr[] = arr[i];

            if (mergedarr[1] >= curr[0]) //dont overthink here
            {
                mergedarr[1] = Math.max(mergedarr[1], curr[1]);
            } else {
                //cut down the interval
                mergedarr = curr;
                result.add(mergedarr);
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int[] interval : result) {
            ArrayList<Integer> temp = new ArrayList<>();
            //[1,4]
            temp.add(interval[0]); //adds each element  ->add 1

            temp.add(interval[1]); //adds ecah element  ->add 2
            ans.add(temp);
        }

        return ans;
        
    }
}