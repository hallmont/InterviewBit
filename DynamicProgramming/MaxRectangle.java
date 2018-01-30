public class Solution {

    public int maximalRectangle(int[][] A) {
        int area = 0, new_area, r, l;
        if(A.length > 0)
        {
            int[] line = new int[A[0].length];
            boolean[] is_processed = new boolean[A[0].length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < A[i].length; j++){
                    if (A[i][j] == 1) {
                        line[j]++;
                        is_processed[j] = false;
                    } else {
                        line[j] = 0;
                        is_processed[j] = true;
                    }
                }
                for(int j = 0; j < A[i].length; j++){
                    if(is_processed[j]) continue;
                    r = l = 1;
                    while((j + r < line.length)&&(line[j + r] >= line[j])){
                        if(line[j + r] == line[j]) is_processed[j + r] = true;
                        r++;
                    }
                    while((j - l >= 0)&&(line[j - l] >= line[j])) l++;
                    new_area = (r + l - 1)*line[j];
                    if (new_area > area) area = new_area;
                }
            }
        } return area;
    }
}
