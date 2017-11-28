public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        if (A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        int streakMain = 1;
        int streak = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                if (A[i] == A[i-1]+1) {
                    streak++;
                }
                else {
                    streakMain = Math.max(streakMain, streak);
                    streak = 1;
                }
            }
        }

        return Math.max(streakMain, streak);
    }
}
