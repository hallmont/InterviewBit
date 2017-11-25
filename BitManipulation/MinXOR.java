public class MinXOR
{
    public int findMinXor(int[] A) {
        int minXOR = Integer.MAX_VALUE;
      
        Arrays.sort( A );
        for (int i=0; i < A.length-1; i++) {
            int num = A[i] ^ A[i+1];
            minXOR = Math.min(minXOR, num );
        }
      
        return minXOR;
    }
}
