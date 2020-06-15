package cn.zhangxun.junel.offer1.test5;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/15 21:36
 */
@Slf4j
public class RebuildBinaryTree {

    /**
     * 题目：给定二叉树的前序遍历（无重复值）和中序遍历（无重复值）结果，重建出该二叉树。
     * 前序遍历，根节点、左节点、右节点；
     * 中序遍历，左节点、根节点、右节点；
     * 后序遍历，左节点、右节点、根节点
     * <p>
     * 示例：
     * preOrder[3,9,20,15,7]
     * middleOrder[9,3,15,20,7]
     * <p>
     * 思路：
     * 前序遍历的第一个值即为整个二叉树的根节点，再根据中序遍历，确定[9]为左子树，[15,20,7]为右子树
     * 然后迭代上述过程
     */

    private static Map<Integer, Integer> indexForMiddleOrder = new HashMap<>(16);

    public static TreeNode rebuildBinaryTree(int[] preOrder, int[] middleOrder) throws Exception {
        if (preOrder == null || middleOrder == null) {
            log.error("给定的前序和中序遍历为空");
            throw new Exception("给定的前序和中序遍历为空");
        }
        // 缓存中序遍历中每个值对应的索引
        for (int i = 0; i < middleOrder.length; i++) {
            indexForMiddleOrder.put(middleOrder[i], i);
        }
        return executeRebuild(preOrder, 0, preOrder.length - 1, 0);
    }

    private static TreeNode executeRebuild(int[] preOrder, int preLeft, int preRight, int middleLeft) {
        // 递归退出的条件
        if (preLeft > preRight) {
            return null;
        }
        // 当前子树前序遍历的第一个值即为根节点
        TreeNode root = new TreeNode();
        root.setValue(preOrder[preLeft]);

        // 获取当前根节点在中序遍历中的数组下标
        int middleIndex = indexForMiddleOrder.get(root.getValue());
        // 获取当前根节点左子树的大小
        int leftTreeSize = middleIndex - middleLeft;
        root.setLeftNode(executeRebuild(preOrder, preLeft + 1, preLeft + leftTreeSize, middleLeft));
        root.setRightNode(executeRebuild(preOrder, preLeft + leftTreeSize + 1, preRight, middleLeft + leftTreeSize + 1));
        return root;
    }

}
