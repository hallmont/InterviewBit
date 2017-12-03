public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] twoSum(final int[] A, int B) {
        HashMap map = new HashMap();
        int index1 = 0;
        int index2 = 0;
        for( int i=0; i<A.length; i++ ) {
            int target = B - A[i];
            Integer val = (Integer)map.get(target);
            if ( val == null ) {
                Integer val2 = (Integer)map.get(A[i]);
                if( val2 == null )
                    map.put(A[i],i+1);
            } else {
                index1 = val.intValue();
                index2 = i+1;
                break;
            }
        }
        
        int[] array = {index1,index2};
        int[] emptyArray = {};

        if ( index1 != 0 && index2 != 0 )
            return array;
            
        return emptyArray;
    }
}
