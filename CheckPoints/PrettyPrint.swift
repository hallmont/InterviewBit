import Foundation

class Solution {
    func prettyPrint(_ A: inout Int) -> [[Int]] {
        let size = A * 2 - 1
        
        var matrix = Array(repeating: Array(repeating: 0, count: size), count: size)
        for i in 0..<A {
            let fillValue = A-i
            let squareSize = fillValue * 2 - 1
            drawSquare( matrix: &matrix, row: i, col: i, size: squareSize, fillValue: fillValue )
        }
        
        return matrix
    }

    func drawSquare( matrix: inout [[Int]], row: Int, col: Int, size: Int, fillValue: Int ) {
        let end = row + size - 1
        for i in row..<row+size {
            matrix[row][i] = fillValue
            matrix[i][col] = fillValue
            matrix[end][i] = fillValue
            matrix[i][end] = fillValue
        }
    }
    
    func printMatrix( matrix: [[Int]] ) {
        for i in 0..<matrix.count {
            for j in 0..<matrix[0].count {
                print( "\(matrix[i][j]) ", terminator: "" )
            }
            print()
        }
    }
}

var size = 4
let solution = Solution()
let matrix = solution.prettyPrint( &size )
solution.printMatrix(matrix: matrix)
