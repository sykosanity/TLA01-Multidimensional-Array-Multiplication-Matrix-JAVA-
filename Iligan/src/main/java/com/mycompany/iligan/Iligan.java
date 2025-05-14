/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.iligan;

/**
 *
 * @author Student's Account
 */
public class Iligan {

    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] mutliplicationMatrix = new int[11][11];

        for (int z = 1; z < 11; z++) {
            for (int i = 1; i < 11; i++) {
                mutliplicationMatrix[z][i] = z * i;
            }
        }
        
        for (int z = 1; z < 11; z++) {
            for (int i = 1; i < 11; i++) {

                System.out.printf("%4d", mutliplicationMatrix[z][i]);
            }
            System.out.println("");
        }
    }
}

















//public class MatrixMultiplication {
//
//    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
//        int rows1 = matrix1.length;
//        int cols1 = matrix1[0].length;
//        int rows2 = matrix2.length;
//        int cols2 = matrix2[0].length;
//
//        if (cols1 != rows2) {
//            throw new IllegalArgumentException("Matrices cannot be multiplied: Incompatible dimensions.");
//        }
//
//        int[][] result = new int[rows1][cols2];
//
//        for (int i = 0; i < rows1; i++) {
//            for (int j = 0; j < cols2; j++) {
//                for (int k = 0; k < cols1; k++) {
//                    result[i][j] += matrix1[i][k] * matrix2[k][j];
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
//        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
//
//        int[][] product = multiplyMatrices(matrixA, matrixB);
//
//        // Print the result
//        for (int[] row : product) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//    }
//}