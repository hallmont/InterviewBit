public class PrettyPrint
{
    public int[][] prettyPrint(int A) {
        int size = A*2 - 1;

        int[][] matrix = new int[size][size];

        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                matrix[i][j] = 0;

        for( int i=0; i<A; i++ ) {
            int fillValue = A-i;
            int squareSize = fillValue * 2 -1;
            drawSquare( matrix, i, i, squareSize, fillValue );
        }

        return matrix;
    }

    void printMatrix( int[][] matrix ) {
        int size = matrix[0].length;
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++)
                System.out.print( matrix[i][j] + " " );
            System.out.println();
        }
    }

    void drawSquare( int[][] matrix, int row, int col, int size, int fillValue ) {
        int end = row + size - 1;
        for( int i=row; i<=end; i++ ) {
            matrix[row][i] = fillValue;
            matrix[end][i] = fillValue;
            matrix[i][col] = fillValue;
            matrix[i][end] = fillValue;
        }
    }
}
