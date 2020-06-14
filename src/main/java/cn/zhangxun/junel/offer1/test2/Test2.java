package cn.zhangxun.junel.offer1.test2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/13 15:45
 */
public class Test2 {

    @Test
    public void test1(){
        int[][] specificArray = null;
        int targetValue = 0;
        // 异常判断方式一
        Throwable throwable = catchThrowable(() -> Array1.isNumberExistsInArray(specificArray, targetValue));
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage("输入条件异常，无法查找");
    }

    @Test
    public void test2(){
        int[][] specificArray = new int[0][0];
        int targetValue = 0;
        // 异常判断方式二
        assertThatThrownBy(() -> Array1.isNumberExistsInArray(specificArray, targetValue))
                .isInstanceOf(Exception.class)
                .hasMessage("输入条件异常，无法查找");
    }

    @Test
    public void test3(){
        int[][] specificArray = new int[0][0];
        int targetValue = 0;
        // 异常判断方式三
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> Array1.isNumberExistsInArray(specificArray, targetValue))
                .withMessage("输入条件异常，无法查找");
    }

    @Test
    public void test4(){
        int[][] specificArray = new int[0][0];
        int targetValue = 0;
        // 异常判断方式四
        try {
            Array1.isNumberExistsInArray(specificArray, targetValue);
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("输入条件异常，无法查找");
        }
    }

    @Test
    public void test5() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
            ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 10;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isTrue();
    }

    @Test
    public void test6() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
                ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 99;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isFalse();
    }

    @Test
    public void test7() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
                ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 15;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isTrue();
    }

    @Test
    public void test8() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
                ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 18;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isTrue();
    }

    @Test
    public void test9() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
                ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 30;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isTrue();
    }

    @Test
    public void test10() throws Exception {
        int[][] specificArray = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}
                ,{10,13,14,17,24},{18,21,23,26,30}};
        int targetValue = 1;
        assertThat(Array1.isNumberExistsInArray(specificArray, targetValue)).isTrue();
    }

}
