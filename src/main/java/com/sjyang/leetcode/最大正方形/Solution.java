package com.sjyang.leetcode.最大正方形;

/**
 * @author saijun.yang
 * @date 2020/5/8 14:44
 * @description 最大正方形
 *在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 * 示例:
 * 输入:
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * 输出: 4
 * 暴力解法：遍历找到字符为1的进行向右和向下扩展，找到最大的返回
 */
public class Solution {
    public static void main(String[] args) {
        char[][] matrix = {{'1','1'},{'1','1'}};//{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(""+maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        int row = matrix.length;
        if(matrix == null || row == 0){
            return maxSide;
        }
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                char base = matrix[i][j];
                if('1' == base){
                    maxSide = Math.max(maxSide,1);
                    //计算可能的最大边长
                    int mayBeMaxSide = Math.min(row-i,column-j);
                    //开始持续加一
                    for (int k = 1; k < mayBeMaxSide; k++) {
                        //判断加一后，是否满足是正方形(这个是判断对角)
                        if(matrix[i+k][j+k] == '0'){
                            break;
                        }
                        boolean flag = true;
                        //这个是逐一判断右侧和下侧
                        for (int m = 0; m < k; m++) {
                            if (matrix[i + k][j + m] == '0' || matrix[i + m][j + k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            maxSide = Math.max(maxSide, k + 1);
                        } else {
                            break;
                        }
                        maxSide = Math.max(maxSide,k);
                    }
                }
            }
        }
        return maxSide*maxSide;
    }
}
