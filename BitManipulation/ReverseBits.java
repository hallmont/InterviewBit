public class Solution {
    
public long reverse(long n) {
    long answer = 0;
        for (int i = 0; i < 32; i++) {
            answer = (answer << 1) | (n & 1);
            n = (n >> 1);
        }
    
    return answer;
}

}
