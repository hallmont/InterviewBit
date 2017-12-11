public class LongestSubstring {
    public int lengthOfLongestSubstring(String A) {
        int length = A.length();
        if( length < 1 ) return length;

        int start = 0, end = 0;
        int wordLength = 0;
        int maxWordLength = 1;
        HashMap map = new HashMap();
    	while( end < length ) {
            char ch = A.charAt(end);
            Integer index = (Integer)map.get(ch);
            // Character not repeated
            if( index == null ) {
                map.put(ch,end);
            } else { // Character repeated
                map.put(ch,end);
                start = Math.max(start,index + 1);
                end = Math.max(start,end);
            }
            wordLength = end - start + 1;
            maxWordLength = Math.max( wordLength, maxWordLength);
            end++;
        }
        return maxWordLength;
    }
}
