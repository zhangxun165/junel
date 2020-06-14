package cn.zhangxun.junel.offer1.test3;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Fail.fail;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/14 9:55
 */
public class Test3 {

    @Test
    public void test1(){
        String originalStr = "";
        try {
            SpaceReplace.replaceSpace(new StringBuffer(originalStr));
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("字符串不能为空");
        }
    }

    @Test
    public void test2(){
        String originalStr = "wearehappy.";
        try {
            String targetStr = SpaceReplace.replaceSpace(new StringBuffer(originalStr));
            assertThat(targetStr).isEqualTo(originalStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        String originalStr = "we are happy.";
        try {
            String targetStr = SpaceReplace.replaceSpace(new StringBuffer(originalStr));
            assertThat(targetStr).isEqualTo("we%20are%20happy.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        String originalStr = " we are happy. ";
        try {
            String targetStr = SpaceReplace.replaceSpace(new StringBuffer(originalStr));
            assertThat(targetStr).isEqualTo("%20we%20are%20happy.%20");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
