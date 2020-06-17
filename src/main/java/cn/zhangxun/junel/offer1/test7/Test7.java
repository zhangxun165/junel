package cn.zhangxun.junel.offer1.test7;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.fail;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/18 0:15
 */
public class Test7 {

    @Test
    public void test1(){
        int[] array1 = null;
        try {
            FindFirstDuplicateValue.findFirstDuplicateValue(array1);
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("数组为空或者长度为0");
        }

        try {
            FindFirstDuplicateValue.findFirstDuplicateValue2(array1);
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("数组为空或者长度为0");
        }
    }

    @Test
    public void test2(){
        int[] array2 = {2,3,1,0,2,5};
        try {
            int t1 = FindFirstDuplicateValue.findFirstDuplicateValue(array2);
            assertThat(t1).isEqualTo(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int t2 = FindFirstDuplicateValue.findFirstDuplicateValue2(array2);
            assertThat(t2).isEqualTo(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        int[] array2 = {2,3,1,0,5};
        try {
            int t1 = FindFirstDuplicateValue.findFirstDuplicateValue(array2);
            assertThat(t1).isEqualTo(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int t2 = FindFirstDuplicateValue.findFirstDuplicateValue2(array2);
            assertThat(t2).isEqualTo(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
