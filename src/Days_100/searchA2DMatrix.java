package Days_100;

import java.util.Scanner;

public class searchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();

        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col>=0){
            if(matrix[row][col] == target){
                System.out.println("true");
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("false");
    }
}
