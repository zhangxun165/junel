package cn.zhangxun.junel.offer1.test1;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 23:33
 */
public class MySun4 {

    /**
     * 双重检查锁模式的单例：
     * 在同步模式的基础上，去除了方法级别的锁；
     * 优点是在单例已经创建好的情况下，没有线程等待了，效率得到了提升；
     * 缺点是代码实现比较复杂，不够直观；
     */
    private static MySun4 sun;

    private MySun4(){}

    public static MySun4 getSun(){
        if(sun == null){
            // 有可能会有多个线程同时进入到这一步，然后竞争锁资源执行同步方法
            synchronized (MySun4.class) {
                // 所以要在这里进行第二次非空检查，双重检查的名称由此而来
                if(sun == null) {
                    sun = new MySun4();
                }
            }
        }
        return sun;
    }

}
