public class NobleInteger {
    public int solve(int[] A) {
        Arrays.sort( A );
        
        for(int i=0; i<A.length; i++) {
            int index=A.length;
            for( int j=i+1; j<A.length; j++) {
               if ( A[j] > A[i] ) {
                   index = j;
                   break;
               }
            }
            
            if ( A[i] == (A.length-index) ) {
                return 1;
            } 
        }
        return -1;
    }
}
