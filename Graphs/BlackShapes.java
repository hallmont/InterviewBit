public class Solution {
    public int black(ArrayList<String> A) {
        if (A.size() == 0) return 0;
        int[][] arr = new int[A.size()][A.get(0).length()];
        
        int i = 0;
        for (String str: A) {
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = 0;
                if (str.charAt(j) == 'X') arr[i][j] = 1;
            }
            i++;
        }
        
        return _sol(arr, A.size(), A.get(0).length());
    }
    
    public int _sol(int [][]arr, int r, int c) {
        boolean[][] visited = new boolean[r][c];
        
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    dfs(arr, i, j, visited, r, c);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void dfs(int[][] arr, int i, int j, boolean[][] visited, int r, int c) {
        if (i < 0 || i > r-1) return;
        
        if (j <0 || j > c-1) return;
        
        if (arr[i][j] == 0 || visited[i][j]) {
            return;
        }
        
        visited[i][j] = true;
        dfs(arr, i+1, j, visited, r, c);
        dfs(arr, i-1, j, visited, r, c);
        dfs(arr, i, j+1, visited, r, c);
        dfs(arr, i, j-1, visited, r, c);
    }
}

