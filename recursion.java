package com.enterops.viraj;

// Pascal Triangle example using recursion

public class recursion {
	
    public static int pascalTriangle(int rows, int columns) {
        if (columns == 0 || columns == rows) {
            return 1;
        } else {
            return pascalTriangle(rows - 1, columns - 1) + pascalTriangle(rows - 1, columns);
        }
    }
    
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle(i,j));
            }
            System.out.println();
        }
    }

}
//Here pascalTriangle method takes the row and column values as parameters and use recursion to calculate value of Pascal Triangle.
