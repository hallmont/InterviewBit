public class SingleNumber
{
    public int singleNumber(final int[] A) {
        Hashtable table = new Hashtable();
        
        for( int i=0; i<A.length; i++) {
            int val = A[i];
            if( table.containsKey( val ) ) {
                table.remove( val );
            }
            else {
                table.put(val,"");
            }
        }
        
        Integer result = (Integer)table.keySet().toArray()[0];
        return result;
    }
}
