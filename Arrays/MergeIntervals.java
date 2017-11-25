/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeIntervals {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if( intervals.size() < 2 ) {
            return intervals;
        }
        Collections.sort(intervals, new IntervalComparator());
        
        ArrayList<Interval> newIntervals = new ArrayList<Interval>();
      
        Interval a = null;
        Interval b = null;
        Interval merged = null;
        
        a = intervals.get(0);  
        for( int i=1; i<intervals.size(); i++) {
            b = intervals.get(i);

            if ( isOverlapped(a,b) ) {
                merged = new Interval( Math.min(a.start,b.start), Math.max(a.end,b.end));
                a = merged;
            }
            else {
                if( merged != null ) {
                    newIntervals.add( merged );
                    merged = null;
                }
                else newIntervals.add( a );
                a = b;
            }
        }
        if ( merged != null ) {
            newIntervals.add( merged );
        }
        else newIntervals.add( b );
        
        return newIntervals;
    }
    
    boolean isOverlapped( Interval a, Interval b) {
        return a.start <= b.end && b.start <= a.end;
    }
}

class IntervalComparator implements Comparator
{
    public int compare(Object a, Object b)
    {
        return ((Interval)a).start - ((Interval)b).start;
    }
}
