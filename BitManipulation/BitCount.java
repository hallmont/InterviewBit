public class BitCount
{ 
    public int numSetBits(long a) {
	int count = 0;

	while (a > 0) {
	    count += a & 1L;
	    a >>= 1L;
	}
	return count;
    }
}
