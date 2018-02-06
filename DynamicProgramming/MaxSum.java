public class Solution {
public int adjacent(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> topArray = A.get(0);
        ArrayList<Integer> botArray = A.get(1);

        int size = topArray.size();
        if (size == 0) {
            return 0;
        }

        int[] topResult = new int[size];
        int[] botResult = new int[size];

        for (int i = 0; i < size; i++) {
            if (i < 2) {
                topResult[i] = topArray.get(i);
                botResult[i] = botArray.get(i);
                continue;
            }
            // consider the 4 entries from column -1 and column -2
            int maxSum = 0;
            if (i - 2 >= 0) {
                if (topResult[i - 2] > maxSum) {
                    maxSum = topResult[i - 2];
                }
                if (botResult[i - 2] > maxSum) {
                    maxSum = botResult[i - 2];
                }
            }

            if (i - 3 >= 0) {
                if (topResult[i - 3] > maxSum) {
                    maxSum = topResult[i - 3];
                }
                if (botResult[i - 3] > maxSum) {
                    maxSum = botResult[i - 3];
                }
            }

            topResult[i] = topArray.get(i) + maxSum;
            botResult[i] = botArray.get(i) + maxSum;
        }

        int maxSum = 0;
        if (topResult[size - 1] > maxSum) {
            maxSum = topResult[size - 1];
        }
        if (botResult[size - 1] > maxSum) {
            maxSum = botResult[size - 1];
        }

        if (size > 1) {
            if (topResult[size - 2] > maxSum) {
                maxSum = topResult[size - 2];
            }

            if (botResult[size - 2] > maxSum) {
                maxSum = botResult[size - 2];
            }
        }

        return maxSum;
}
}
