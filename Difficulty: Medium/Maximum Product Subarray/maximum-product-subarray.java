class Solution {
    int maxProduct(int[] arr) {

        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int x = arr[i];

            // If current number is negative,
            // max and min swap roles.
            if (x < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(x, maxSoFar * x);
            minSoFar = Math.min(x, minSoFar * x);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}