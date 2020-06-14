package cn.zhangxun.junel.offer1.test4;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/14 10:11
 */
@Slf4j
public class PrintLinkedList {

    /**
     * 题目：输入一个链表的头节点，从尾到头反过来打印每个节点的值
     * input 123
     * output 321
     */

    /**
     * 使用递归
     * 优点是代码简单，逻辑清晰；
     * 缺点是当链表节点很多时，调用栈会很深；
     */
    public static List<Integer> getReversedLinkedList1(ListNode node) throws Exception {
        if(node == null){
            log.error("给定的头结点不能为空");
            throw new Exception("给定的头结点不能为空");
        }

        List<Integer> reversedValue = new ArrayList<>(16);
        // 当前节点还有下一个节点，就递归给下个节点处理
        if(node.getNextNode() != null){
            reversedValue.addAll(getReversedLinkedList1(node.getNextNode()));
            reversedValue.add(node.getValue());
        } else {
            // 当前节点就是最后一个节点，则记录其值
            reversedValue.add(node.getValue());
        }
        return reversedValue;
    }

    /**
     * 使用头插法
     * 优点是没有借助额外的存储空间；
     * 缺点是改变了原有的链表结构；
     * 1->2->3
     * N->1,2->3
     * N->2->1,3
     * N->3->2->1
     */
    public static List<Integer> getReversedLinkedList2(ListNode node) throws Exception {
        if(node == null){
            log.error("给定的头结点不能为空");
            throw new Exception("给定的头结点不能为空");
        }

        // 创建一个为空的头节点
        ListNode front = new ListNode();
        while(node !=null){
            // 先记录下一轮的开始节点
            ListNode nextTurnNode = node.getNextNode();
            // 当前节点在头节点的头部插入，并和原链表断开
            node.setNextNode(front.getNextNode());
            // 当前节点和头结点进行连接
            front.setNextNode(node);
            // 开始下一轮
            node = nextTurnNode;
        }

        List<Integer> resultList = new ArrayList<>();
        ListNode currentNode = front.getNextNode();
        while (currentNode != null){
            resultList.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        return resultList;
    }

    /**
     * 使用栈
     * 优点是逻辑简单清晰；
     * 缺点是需要借助额外的栈作为存储空间；
     */
    public static List<Integer> getReversedLinkedList3(ListNode node) throws Exception {
        if(node == null){
            log.error("给定的头结点不能为空");
            throw new Exception("给定的头结点不能为空");
        }

        Stack<Integer> stack = new Stack<>();
        // 遍历链表节点，将值放入栈中
        while(node != null){
            stack.add(node.getValue());
            node = node.getNextNode();
        }

        // 遍历栈将值pop出来，天然就是倒叙的
        List<Integer> resultList = new ArrayList<>();
        while(!stack.isEmpty()){
            resultList.add(stack.pop());
        }
        return resultList;
    }

}
