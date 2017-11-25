public class SquareRoot {
    public int sqrt(int a) {
        if( a == 0 || a == 1 ) return a;
        int squareRoot = binarySearch( a );

        return squareRoot;
    }

    int binarySearch( int x )
    {
        long l = 0, r = x/2;
        long mid = 0;
        long square = 0;
        long result = 0;
        while (l <= r)
        {
            mid = l + (r-l)/2;
            if ( mid*mid == x)
                return (int)mid;

            if ( mid*mid < x ) {
                l = mid + 1;
                result = mid;
            } else
                r = mid - 1;
        }

        return (int)result;
    }
}
