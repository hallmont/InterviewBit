public class SortedInsertPosition
{
    public int searchInsert(ArrayList<Integer> a, int b)
    {
        int index = binarySearch( a, b );

        return index;
    }
	
    int binarySearch(ArrayList<Integer> arr, int x)
    {
        int l = 0, r = arr.size() - 1;
        int m = 0;
        while (l <= r)
        {
            m = l + (r-l)/2;

            if (arr.get(m) == x)
                return m;

            if (arr.get(m) < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return l;
    }
}
