public class Solution {
    public int wordBreak(String A, String[] B) {
        HashSet<String> dict = new HashSet<String>();
        for( int i = 0; i<B.length; i++ )
            dict.add(B[i]);
            
        boolean result = wordBreak(A, dict );
        if( result == true ) return 1;
        return 0;
    }
    
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
 
                if(t[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }
}
