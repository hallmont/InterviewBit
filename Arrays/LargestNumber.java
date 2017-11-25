public class LargestNumber {

    public String largestNumber(final int[] A) {
        sort( A, 0, A.length-1 );
        
        StringBuilder builder = new StringBuilder();
        for( int i=0; i<A.length; i++ ) {
            builder.append( Integer.toString(A[i]) );
        }
    
        String str = builder.toString();
        if( str != null && str.length() > 0 ) {
           if( str.charAt(0) == '0' ) {
              return "0";
           }
        }
        return str;
    }
    
    int getMultiplier(int x) {
        int y = 1;
        while (x > 9) {
            x /= 10;
            y *= 10;
        }
        return y;
    }
    
    double concat(int x, int y) {
       return( (double)((double)x * (double)(getMultiplier(y)*10) + (double)(y)) );
    }
    
    int partition(int arr[], int low, int high)
    {
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            double A2Pivot = concat( arr[high], arr[j] );
            double A1 = concat( arr[j], arr[high] );
            if (A1 > A2Pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
