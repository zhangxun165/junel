package cn.zhangxun.junel.offer1.test2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/13 15:12
 */
@Slf4j
public class Array1 {

    /**
     * 题目：给定一个二维数组，其每一行从左到右是递增的，每一列从上到下也是递增的。要求，给定一个数字，判断该数字是否存在这个二维数组中。
     *   [1,   4,  7, 11, 15]
     *   [2,   5,  8, 12, 19]
     *   [3,   6,  9, 16, 22]
     *   [10, 13, 14, 17, 24]
     *   [18, 21, 23, 26, 30]
     */

    public static Boolean isNumberExistsInArray(int[][] specificArray, int targetValue) throws Exception {
        if(specificArray == null || specificArray.length == 0 || specificArray[0].length == 0){
            log.error("输入条件异常，无法查找");
            throw new Exception("输入条件异常，无法查找");
        }

        int maxRowNum = specificArray.length;
        int maxColumnNum = specificArray[0].length;

        // 从右上角开始遍历查找
        int currentIndexRow = 0;
        int currentIndexColumn = maxColumnNum - 1;
        while(currentIndexRow <= maxRowNum - 1 && currentIndexColumn >= 0){
            if(targetValue == specificArray[currentIndexRow][currentIndexColumn]){
                return true;
            } else if(targetValue > specificArray[currentIndexRow][currentIndexColumn]) {
                // 给定的值比右上角的值大，说明给定值一定在右上角值所在行的下方
                currentIndexRow++;
            } else {
                // 给定的值比右上角的值小，说明给定值一定在右上角值所在列的左方
                currentIndexColumn--;
            }
        }

        // 未在二维数组中找到给定的数值
        return false;
    }

}
