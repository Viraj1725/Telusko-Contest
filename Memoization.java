package com.enterops.viraj;

import java.util.HashMap;
import java.util.Map;

//Pascal Triangle example using memoization

public class Memoization {
    private static Map<Integer, Map<Integer, Integer>> cache = new HashMap<>();

    public static void calculatePascalTriangle(int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j <= i; j++) {
                int coefficient = calculateCoefficient(i, j);
                System.out.print(coefficient + " ");
            }
            System.out.println();
        }
    }

    public static int calculateCoefficient(int rows, int columns) {
        if (columns == 0 || columns == rows) {
            return 1;
        } else if (cache.containsKey(rows) && cache.get(rows).containsKey(columns)) {
            return cache.get(rows).get(columns);
        } else {
            int coefficient = calculateCoefficient(rows - 1, columns - 1) + calculateCoefficient(rows - 1, columns);
            cache.putIfAbsent(rows, new HashMap<>());
            cache.get(rows).put(columns, coefficient);
            return coefficient;
        }
    }
    
    public static void main(String[] args) {
        int totalRows = 5; 
        calculatePascalTriangle(totalRows);
    }
}
//Used Memoization for first time so took reference of google
