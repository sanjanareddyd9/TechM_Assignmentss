package pack5;

import java.util.Arrays;


class MatrixMultiplicationThread extends Thread {
 private int row;
 private int[][] result;
 private int[][] matrixA;
 private int[][] matrixB;

 public MatrixMultiplicationThread(int row, int[][] result, int[][] matrixA, int[][] matrixB) {
     this.row = row;
     this.result = result;
     this.matrixA = matrixA;
     this.matrixB = matrixB;
 }

 public void run() {
     int colsB = matrixB[0].length;
     int colsA = matrixA[0].length;

     for (int j = 0; j < colsB; j++) {
         result[row][j] = 0;
         for (int k = 0; k < colsA; k++) {
             result[row][j] += matrixA[row][k] * matrixB[k][j];
         }
     }
 }
}

public class MultiThreadedMatrixMultiplication {
 public static void main(String[] args) {
    
     int[][] matrixA = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
     };

     int[][] matrixB = {
         {1, 4, 7},
         {2, 5, 8},
         {3, 6, 9}
     };

     int rowsA = matrixA.length;
     int colsB = matrixB[0].length;
     int[][] result = new int[rowsA][colsB];

    
     Thread[] threads = new Thread[rowsA];

     for (int i = 0; i < rowsA; i++) {
         threads[i] = new MatrixMultiplicationThread(i, result, matrixA, matrixB);
         threads[i].start();
     }

     
     for (int i = 0; i < rowsA; i++) {
         try {
             threads[i].join();
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }

     
     System.out.println("Resultant Matrix:");
     for (int[] row : result) {
         System.out.println(Arrays.toString(row));
     }
 }
}

