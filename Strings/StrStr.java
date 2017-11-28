public class StrStr {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int lenA = A.length(); // Length of string
        int lenB = B.length(); // Length of pattern
        
        char chA, chB;
        int foundIndex = -1;
        int j = 0;
        for( int i=0; i<lenA; i++) {
            chA = A.charAt(i);
            chB = B.charAt(j);
            
            if ( chA == chB ) {
                if( j == 0 )
                    foundIndex = i;
                if( ++j == lenB ) {
                    return foundIndex;
                }
            }
            else {
                if( j > 0 )
                    i = foundIndex;
                j = 0;
            }
        }
        if( j < lenB )
            return -1;
            
        return foundIndex;
    }
}
