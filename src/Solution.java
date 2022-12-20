public class Solution {
    public static double solution(int[] arr1, int[] arr2) {

        int sq = 0;

        for (int i = 0; i < arr1.length; i++) {

            int diff=arr1[i]-arr2[i];
            sq = sq + diff*diff;

        }

        return  (double) sq/arr1.length;

    }
}