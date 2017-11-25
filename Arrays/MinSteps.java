public class MinSteps {
    public int coverPoints(int[] A, int[] B) {
        int distance = 0;
        int totalDistance = 0;
        for( int i=0; i<A.length-1; i++) {
            int X = Math.abs( A[i+1] - A[i] );
            int Y = Math.abs( B[i+1] - B[i] );
            distance = Math.max( X, Y );
            totalDistance += distance;
        }
        
        return totalDistance;
    }
}
