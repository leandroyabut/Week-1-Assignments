package com.leandroyabut.assignments.highestnumber;

import java.util.GregorianCalendar;
import java.util.Random;

public class HighestNumber {

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, 5); // Generate a 5x5 2D array with random numbers

        printMatrix(matrix);

        int[] maxAndCoords = getMaxNumberFromMatrix(matrix); // Gets an int array 0: max number, 1: x coordinate, 2: y coordinate

        System.out.println("\nMax Number: " + maxAndCoords[0]);
        System.out.println("Position: " + maxAndCoords[1] + ", " + maxAndCoords[2]);
    }

    /**
     *
     * @param rand random object
     * @param min minimum number
     * @param max maximum number
     * @return random number between min and max inclusive
     */
    public static int generateRandomNumber(Random rand, int min, int max) {
        return min + Math.abs(rand.nextInt()) % (max + 1 - min);
    }

    /**
     *
     * @param width width of 2D array
     * @param height height of 2D array
     * @return 2D int array of [height][width] populated with random numbers from 10-99
     */
    public static int[][] generateMatrix(int width, int height) {
        int[][] matrix = new int[height][width];

        Random random = new Random(new GregorianCalendar().getTimeInMillis());

        for(int y = 0; y < height; y++)
            for(int x = 0; x < width; x++)
                matrix[y][x] = generateRandomNumber(random, 10, 99);

        return matrix;
    }

    /**
     *
     * @param matrix 2D int array to print
     */
    public static void printMatrix(int[][] matrix) {
        int height = matrix.length;

        if(height > 0) { // Makes sure matrix is populated with rows
            int width = matrix[height - 1].length;

            StringBuilder builder = new StringBuilder();
            for (int[] ints : matrix) {
                StringBuilder lineBuilder = new StringBuilder();
                for (int x = 0; x < width; x++) {
                    lineBuilder.append(ints[x]).append(" ");
                }
                builder.append(lineBuilder.toString().trim()).append("\n");
            }

            System.out.println(builder.toString().trim());

        } else {
            System.out.println("Matrix is empty...");
        }
    }

    /**
     *
     * @param matrix matrix to search through
     * @return an int array where 0: max number, 1: x coordinate, 2: y coordinate
     */
    public static int[] getMaxNumberFromMatrix(int[][] matrix) {

        int[] maxAndCoords = new int[3];

        int max = 0;
        int height = matrix.length;

        if(height > 0) { // Makes sure matrix is populated with rows
            int width = matrix[height - 1].length;

            for(int y = 0; y < height; y++)
                for(int x = 0; x < width; x++) {
                    if(max < matrix[y][x]){
                        max = matrix[y][x];
                        maxAndCoords[0] = max;
                        maxAndCoords[1] = x;
                        maxAndCoords[2] = y;
                    }
                }

        }

        return maxAndCoords;
    }
}
