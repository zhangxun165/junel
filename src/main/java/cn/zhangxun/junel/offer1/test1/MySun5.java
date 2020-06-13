package cn.zhangxun.junel.offer1.test1;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 23:33
 */
public class MySun5 {

    /**
     * 静态内部类的单例
     */

    private MySun5(){}

    /**
     * 静态内部类
     * 只有在调用其内部类变量的时候，才会加载该内部静态类，所以不会像饿汉模式一样，存在提前创建的资源浪费行为
     * 线程安全由JVM自身的机制提供保证
     */
    private static class SunHolder{
        private static final MySun5 sun = new MySun5();
    }

    public static MySun5 getSun(){
        return SunHolder.sun;
    }

}
