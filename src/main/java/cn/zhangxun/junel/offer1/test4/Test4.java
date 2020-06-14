package cn.zhangxun.junel.offer1.test4;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Fail.fail;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/14 10:24
 */
public class Test4 {

    @Test
    public void test1(){
        ListNode head = null;
        try {
            PrintLinkedList.getReversedLinkedList1(head);
            fail("此处应该抛出异常");
        } catch (Exception e) {
            assertThat(e).hasMessage("给定的头结点不能为空");
        }
    }

    @Test
    public void test2(){
        // 初始化链表1->2->3
        ListNode head = new ListNode();
        head.setValue(1);
        ListNode middle = new ListNode();
        middle.setValue(2);
        ListNode tail = new ListNode();
        tail.setValue(3);
        head.setNextNode(middle);
        middle.setNextNode(tail);

        // 目标结果
        List<Integer> targetList = new ArrayList<>(16);
        targetList.add(3);
        targetList.add(2);
        targetList.add(1);

        try {
            List<Integer> resultList = PrintLinkedList.getReversedLinkedList1(head);
            assertThat(resultList).isEqualTo(targetList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        // 初始化链表1->2->3
        ListNode head = new ListNode();
        head.setValue(1);
        ListNode middle = new ListNode();
        middle.setValue(2);
        ListNode tail = new ListNode();
        tail.setValue(3);
        head.setNextNode(middle);
        middle.setNextNode(tail);

        // 目标结果
        List<Integer> targetList = new ArrayList<>(16);
        targetList.add(3);
        targetList.add(2);
        targetList.add(1);

        try {
            List<Integer> resultList = PrintLinkedList.getReversedLinkedList2(head);
            assertThat(resultList).isEqualTo(targetList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        // 初始化链表1->2->3
        ListNode head = new ListNode();
        head.setValue(1);
        ListNode middle = new ListNode();
        middle.setValue(2);
        ListNode tail = new ListNode();
        tail.setValue(3);
        head.setNextNode(middle);
        middle.setNextNode(tail);

        // 目标结果
        List<Integer> targetList = new ArrayList<>(16);
        targetList.add(3);
        targetList.add(2);
        targetList.add(1);

        try {
            List<Integer> resultList = PrintLinkedList.getReversedLinkedList3(head);
            assertThat(resultList).isEqualTo(targetList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
