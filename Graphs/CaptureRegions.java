public class Solution {
	public void solve(ArrayList<ArrayList<Character>> board) {
        int rown = board.size();
        if (rown==0) return;
        int coln = board.get(0).size();
        for (int row=0; row<rown; ++row) {
            for (int col=0; col<coln; ++col) {
                if (row==0 || row==rown-1 || col==0 || col==coln-1) {
                    if (board.get(row).get(col)=='O') {
                        Queue<Integer> q = new LinkedList<>();
                        board.get(row).set(col,'1');
                        q.add(row*coln+col);
                        while (!q.isEmpty()) {
                            int cur = q.poll();
                            int x = cur/coln;
                            int y = cur%coln;
                            if (y+1<coln && board.get(x).get(y+1)=='O') {
                                q.add(cur+1);
                                board.get(x).set(y,'1');
                            }
                            if (x+1<rown && board.get(x+1).get(y)=='O') {
                                q.add(cur+coln);
                                board.get(x+1).set(y,'1');
                            }
                            if (y-1>=0 && board.get(x).get(y)=='O') {
                                q.add(cur-1);
                                board.get(x).set(y-1,'1');
                            }
                            if (x-1>=0 && board.get(x-1).get(y)=='O') {
                                q.add(cur-coln);
                                board.get(x-1).set(y,'1');
                            }
                        }
                    }
                }
            }
        }
        for (int i=0; i<rown; ++i) {
            for (int j=0; j<coln; ++j) {
                if (board.get(i).get(j)=='O') {
                    board.get(i).set(j,'X');
                } else if (board.get(i).get(j)=='1') {
                    board.get(i).set(j,'O');
                }
            }
        }
    }
}
