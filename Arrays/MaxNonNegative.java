public class MaxNonNegative {
    public int[] maxset(int[] A) {
        long sum = 0;
        long largestSum = 0;
        
        int length = 0;
        int largestLength = 0;
        
        int startIndex = 0;
        int endIndex = 0;
        
        int largestStartIndex = 0;
        int largestEndIndex = 0;
        
        boolean newList = true;
        boolean endOfSubList = false;
        boolean atLeastOneList = false;
        
        for( int i=0; i<A.length; i++) {

            if( A[i] >= 0 ) {
                if( newList == true ) {
                    startIndex = i;
                    length = 0;
                    sum = 0;
                }
                newList = false;
                sum = sum + A[i];
                length++;
                endIndex = i;

                if( i == (A.length-1) ) {
                   endOfSubList = true;
                   atLeastOneList = true;
                }
                else if( A[i+1] < 0 ) {
                   endOfSubList = true;
                   atLeastOneList = true;
                   i++;
                }
            }
            
            if( endOfSubList ) {
                endOfSubList = false;
                newList = true;
                boolean isLargest = false;
                
                if( sum > largestSum ) {
                    isLargest = true;
                }
                else if ( sum == largestSum ) {
                    if( length > largestLength ) {
                        isLargest = true;
                    }
                }
                
                if( isLargest ) {
                    largestSum = sum;
                    largestLength = length;
                    largestStartIndex = startIndex;
                    largestEndIndex = endIndex;
                }
            }
        }
        
        if ( atLeastOneList ) {
            int B[] = new int[ largestEndIndex - largestStartIndex + 1 ];
            int j = 0;
            for( int i=largestStartIndex; i<=largestEndIndex; i++) {
                B[j++] = A[i];
            }
            
            return B;
        } else {
            return new int[0];
        }
    }
}
