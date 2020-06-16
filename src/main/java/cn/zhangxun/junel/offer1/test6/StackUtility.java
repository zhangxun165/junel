package cn.zhangxun.junel.offer1.test6;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/16 22:48
 */
@Slf4j
public class StackUtility {

    /**
     * 题目：用两个栈来实现队列
     */

    /**
     * inStack专门用来执行队列的入队操作；
     * outStack专门用来执行队列的出队操作；
     */
    private static Stack<Integer> inStack = new Stack<>();
    private static Stack<Integer> outStack = new Stack<>();

    public static void push(int val){
        inStack.push(val);
    }

    public static int pop() throws Exception {
        // 如果出队的栈为空，需要将入队的栈中所有内容都挪过来
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }

        if(outStack.isEmpty()){
            throw new Exception("队列中没有值");
        }

        return outStack.pop();
    }

}
