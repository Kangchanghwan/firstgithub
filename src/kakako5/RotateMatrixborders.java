package kakako5;

public class RotateMatrixborders {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/77485
		
		int row = 3;
		int columns = 3; 
		int[][] queries = {{1,1,2,2}, {1,2,2,3},{2,1,3,2},{2,2,3,3}};
		int[][] mat = creatMatrix(row, columns);	
		int[] result = new int[queries.length];
		for(int i = 0 ; i < queries.length ; i ++ ) {
			result[i] = rotateMatrix(mat, queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
		}

		for(int i = 0 ; i < result.length ; i ++) {
			System.out.print(result[i] + ",");
		}
		
	}
	
	public static int rotateMatrix(int[][] mat, int x1, int y1, int x2, int y2){
		
		int[][] tempMat = mat;
		int temp = tempMat[x1][y1];
		int min = temp;
		int temp2;
		for(int i = x1 ; i < x2 ; i ++ ) {
			tempMat[i][y1] = tempMat[i + 1][y1];
			min = Math.min(min, tempMat[i][y1]);
		}
		for(int i = y1 ; i < y2 ; i ++) {
			tempMat[x2][i] = tempMat[x2][i + 1];
			min = Math.min(min, tempMat[x2][i]);
		}
		for(int i = x2 ; i > x1 ; i -- ) {
			tempMat[i][y2] = tempMat[i - 1][y2];
			min = Math.min(min, tempMat[i][y2]);
		}
		for(int i = y1 ;  i < y2 ; i++ ) {
			
			temp2 = tempMat[x1][i + 1]; 
			tempMat[x1][i + 1] = temp;
			temp = temp2;			 
			min = Math.min(min, tempMat[x1][i + 1]);
		}
		return min;
	}

	public static int[][] creatMatrix (int row, int columns){
		int[][] matrix = new int[row+1][columns+1];
		int num = 1;
		
		for(int i = 1 ; i <= row ; i ++) {
			for(int j =  1 ; j <= columns ; j++) {
				matrix[i][j] = num;
				num ++;
			}
		}
		
		return matrix;

	}
	
	public static void printMatrix (int[][] matrix){
		for(int i = 0 ; i < matrix.length ; i ++) {
			for(int j =  0 ; j < matrix[i].length ; j++) {
				 System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		
		}
	}
}
