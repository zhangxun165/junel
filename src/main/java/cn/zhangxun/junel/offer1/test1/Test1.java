package cn.zhangxun.junel.offer1.test1;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 21:09
 */
public class Test1 {
    /**
     * 题目：设计一个类，我们只能生成该类的一个实例，即实现一个单例模式
     */

    @Test
    public void testMySun1InSingleThread(){
        MySun1 sun = MySun1.getSun();
        assertThat(sun).isNotNull();
    }

    /**
     * 多线程调试，各自打印的对象内存地址应该是相同的
     */
    @Test
    public void testMySun1InMultiThread(){
        Thread thread1 = new Thread(() -> {
            MySun1 sun = MySun1.getSun();
            System.out.println(sun);
        });

        Thread thread2 = new Thread(() -> {
            MySun1 sun = MySun1.getSun();
            System.out.println(sun);
        });

        thread1.start();
        thread2.start();
    }

    @Test
    public void testMySun2InSingleThread(){
        MySun2 sun = MySun2.getSun();
        assertThat(sun).isNotNull();
    }

    /**
     * 多线程调试，各自打印的对象内存地址有时会不同，说明获取的不是同一个对象
     * 从而证明懒汉模式的单例在多线程场景下异常
     *
     * Tips:如果多次尝试都未获得预期结果，可以尝试使用多线程断点调试
     */
    @Test
    public void testMySun2InMultiThread(){
        Thread thread1 = new Thread(() -> {
            MySun2 sun = MySun2.getSun();
            System.out.println(sun);
        });

        Thread thread2 = new Thread(() -> {
            MySun2 sun = MySun2.getSun();
            System.out.println(sun);
        });

        thread1.start();
        thread2.start();
    }

    @Test
    public void testMySun3InSingleThread(){
        MySun3 sun = MySun3.getSun();
        assertThat(sun).isNotNull();
    }

    /**
     * 多线程调试，各自打印的对象内存地址应该是相同的
     */
    @Test
    public void testMySun3InMultiThread(){
        Thread thread1 = new Thread(() -> {
            MySun3 sun = MySun3.getSun();
            System.out.println(sun);
        });

        Thread thread2 = new Thread(() -> {
            MySun3 sun = MySun3.getSun();
            System.out.println(sun);
        });

        thread1.start();
        thread2.start();
    }

    @Test
    public void testMySun4InSingleThread(){
        MySun4 sun = MySun4.getSun();
        assertThat(sun).isNotNull();
    }

    /**
     * 多线程调试，各自打印的对象内存地址应该是相同的
     */
    @Test
    public void testMySun4InMultiThread(){
        Thread thread1 = new Thread(() -> {
            MySun4 sun = MySun4.getSun();
            System.out.println(sun);
        });

        Thread thread2 = new Thread(() -> {
            MySun4 sun = MySun4.getSun();
            System.out.println(sun);
        });

        thread1.start();
        thread2.start();
    }

}
