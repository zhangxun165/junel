package cn.zhangxun.junel.offer1.test3;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/14 9:33
 */

@Slf4j
public class SpaceReplace {

    /**
     * 题目: 将一个字符串中的空格替换成%20
     * we are happy.
     * we%20are%20happy.
     */

    public static String replaceSpace(StringBuffer str) throws Exception {
        if(str == null || str.length() == 0){
            log.error("字符串不能为空");
            throw new Exception("字符串不能为空");
        }

        // p1指向最后一个字符串的位置
        int p1 = str.length() - 1;

        // 将字符串进行扩容，每个空格扩容2个位置
        for(int i=0;i<=p1;i++) {
            if(' ' == str.charAt(i)){
                str.append("  ");
            }
        }

        // p2指向扩容后最后的一个位置
        int p2 = str.length() - 1;

        while(p1 < p2){
            char currentValue = str.charAt(p1--);
            if(' ' == currentValue) {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            }else {
                str.setCharAt(p2--, currentValue);
            }
        }

        return str.toString();
    }

}
