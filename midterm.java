package edu.neu.mgen;
public class midterm {
        public static void main(String[] args) {
            int[][] matrix = {
                {6, 9, 0},
                {4, 7, 8}
            };
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
            System.out.println("The sum of all elements in the matrix is: " + sum);
        }
    }

