package Days_100;

import java.util.Scanner;

public class rotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int k = matrix.length;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < k; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] tempArray = matrix[i];
            reverse(tempArray);
        }
        System.out.println();
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int tempDemoArray = arr[start];
            arr[start] = arr[end];
            arr[end] = tempDemoArray;
            start++;
            end--;
        }
    }
}
