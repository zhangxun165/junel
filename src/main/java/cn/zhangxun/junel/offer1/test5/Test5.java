package cn.zhangxun.junel.offer1.test5;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Fail.fail;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/15 22:27
 */
public class Test5 {

    private int[] preOrder = {3,9,20,15,7};
    private int[] middleOrder = {9,3,15,20,7};

    @Test
    public void test1(){
        preOrder = null;
        middleOrder = null;
        try {
            RebuildBinaryTree.rebuildBinaryTree(preOrder,middleOrder);
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("给定的前序和中序遍历为空");
        }
    }

    @Test
    public void test2(){
        try {
            TreeNode root = RebuildBinaryTree.rebuildBinaryTree(preOrder,middleOrder);
            // 前序遍历进行断言
            assertThat(root.getValue()).isEqualTo(3);
            assertThat(root.getLeftNode().getValue()).isEqualTo(9);
            assertThat(root.getRightNode().getValue()).isEqualTo(20);
            assertThat(root.getRightNode().getLeftNode().getValue()).isEqualTo(15);
            assertThat(root.getRightNode().getRightNode().getValue()).isEqualTo(7);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
