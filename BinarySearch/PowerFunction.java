public class PowerFunction
{
    public int pow(int x, int n, int d) {
        long a = 0;
        if( x == 0 )
            return 0;
        if( n == 0 )
            return 1;

        if ( x < 0 )
            a = (x+d) % d;
        else a = x % d;

        long t = 1;
        while( n > 0 )
        {
            if( (n & 1) == 1 )
            {
                t = (t * a) % d;
            }
            n >>= 1;
            a = (a * a) % d;
        }
        return((int)t);
    }
}
