package com.sjyang.leetcode.最大正方形;

/**
 * @author saijun.yang
 * @date 2020/5/8 17:23
 * @description 动态规划
 */
public class Solution2 {
    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println("" + maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        int row = matrix.length;
        if(matrix == null || row == 0){
            return maxSide;
        }
        int column = matrix[0].length;
        int[][] dp = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == '1'){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
}
