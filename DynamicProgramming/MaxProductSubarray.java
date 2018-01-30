public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
public int maxProduct(final int[] A) {
    if (A == null || A.length == 0) {
        return 0;
    }
    int[] f = new int[A.length];
    int[] g = new int[A.length];
    f[0] = A[0];
    g[0] = A[0];
    int res = A[0];
    for (int i = 1; i < A.length; i++) {
        f[i] = Math.max(Math.max(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        g[i] = Math.min(Math.min(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        res = Math.max(res, f[i]);
    }
    return res;
  }
}
