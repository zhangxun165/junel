package cn.zhangxun.junel.offer1.test6;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Fail.fail;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/16 22:56
 */
public class Test6 {

    @Test
    public void test1(){
        try {
            StackUtility.pop();
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("队列中没有值");
        }
    }

    @Test
    public void test2(){
        StackUtility.push(1);
        try {
            assertThat(StackUtility.pop()).isEqualTo(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        StackUtility.push(1);
        StackUtility.push(2);
        StackUtility.push(3);
        try {
            assertThat(StackUtility.pop()).isEqualTo(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        StackUtility.push(4);
        try {
            assertThat(StackUtility.pop()).isEqualTo(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
