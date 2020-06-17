package cn.zhangxun.junel.offer1.test7;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/17 23:51
 */
@Slf4j
public class FindFirstDuplicateValue {

    /**
     * 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。
     *
     */

    /**
     * 初始数组
     * [2,3,1,0,2,5]
     * i=0时
     * [1,3,2,0,2,5]
     * i=1时
     * [1,0,2,3,2,5]
     * i=2时，发现第2位已经是2，不用操作
     * i=3时，发现第3位已经是3，不用操作
     * i=4时，，准备将2换到第2位，发现两个位置值相同，则找到了第一个重复的值
     * return 2
     */
    public static int findFirstDuplicateValue(int[] array) throws Exception {
        if(array == null || array.length == 0){
            throw new Exception("数组为空或者长度为0");
        }

        // 从数组第一个值开始遍历，将其放到与数组下标对应的位置
        for (int i = 0; i < array.length; i++) {
            // 当前需要挪动的值与其对应下标上的值相等，则表示找到了重复值
            if(array[i] == array[array[i]]){
                return array[i];
            }
            // 不相等，则将该值挪到其对应下标的位置上去
            int temp = array[array[i]];
            array[array[i]] = array[i];
            array[i] = temp;
        }

        // 假设-1为保留值，表示没有重复的数字
        return -1;
    }

    /**
     * 初始数组
     * [2,3,1,0,2,5]
     * i=0时一直循环，直到第0位的值就是0为止，相当于一直在排序了
     * [1,3,2,0,2,5]
     * [3,1,2,0,2,5]
     * [0,1,2,3,2,5]
     * i=1时，发现第1位已经是1，不用操作
     * i=2时，发现第2位已经是2，不用操作
     * i=3时，发现第3位已经是3，不用操作
     * i=4时，准备将2换到第2位，发现两个位置值相同，则找到了第一个重复的值
     * return 2
     */
    public static int findFirstDuplicateValue2(int[] array) throws Exception {
        if(array == null || array.length == 0){
            throw new Exception("数组为空或者长度为0");
        }

        // 从数组第一个值开始遍历，将其放到与数组下标对应的位置
        for (int i = 0; i < array.length; i++) {
            // 一直循环挪动当前位置的值，直到其值等于其对应的下标
            while(array[i] != i){
                // 当前需要挪动的值与其对应下标上的值相等，则表示找到了重复值
                if(array[i] == array[array[i]]){
                    return array[i];
                }
                // 不相等，则将该值挪到其对应下标的位置上去
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
        }

        // 假设-1为保留值，表示没有重复的数字
        return -1;
    }

}
