package study.exArray;

import java.util.Arrays;
import java.util.Scanner;

// 다차원 배열 덧셈
public class test2 {
    public static void main(String[] args) {
        // 2개의 3x3 행렬을 선언하고 초기화
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // 3x3 크기의 결과 행렬을 초기화
        int[][] sumMatrix = new int[3][3];

        // 행렬 덧셈 수행
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 각 요소를 두 행렬의 동일한 위치에 있는 요소들의 합으로 계산
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Matrix A 출력
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        // Matrix B 출력
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        // Sum Matrix 출력
        System.out.println("\nSum Matrix:");
        printMatrix(sumMatrix);
    }

    // 행렬 출력을 위한 사용자 정의 메서드
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // 각 요소를 출력
                System.out.print(matrix[i][j] + " ");
            }
            // 한 행 출력 후 줄 바꿈
            System.out.println();
        }
    }
}