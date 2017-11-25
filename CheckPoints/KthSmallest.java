public class KthSmallest
{
    public int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        return( A[ B-1 ]);
    }
}
