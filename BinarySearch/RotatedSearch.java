public class RotatedSearch
{
    public int search(final List<Integer> a, int b) {

        int result = rotatedSearch( a, 0, a.size()-1, b);
        return result;
    }

    int rotatedSearch( List<Integer> list, int left, int right, int target ) {
        if ( left == right ) {
            if( list.get(left) == target )
                return left;
            else return -1;
        }
        
        int mid = (left + right) / 2;
        if ( list.get(mid) == target )
            return mid;

        if ( list.get(left) <= list.get(mid) ) {
            if ( target >= list.get(left) && target <= list.get(mid) )
                return rotatedSearch(list, left, mid - 1, target);
            return rotatedSearch(list, mid + 1, right, target);
        }

        if ( target >= list.get(mid) && target <= list.get(right) )
            return rotatedSearch(list, mid + 1, right, target);
        return rotatedSearch(list, left, mid - 1, target);
    }
}
