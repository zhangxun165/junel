package cn.zhangxun.junel.offer1.test1;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 23:33
 */
public class MySun3 {

    /**
     * 同步模式的单例：
     * 在懒汉模式的基础上，为获取单例对象的方法加上同步锁；
     * 优点是使得懒汉模式的单例在多线程场景下也能适用了；
     * 缺点是锁住了整个方法，没准当前单例已经创建好了，却不得不等待释放锁资源，造成线程等待，比较低效；
     */
    private static MySun3 sun;

    private MySun3(){}

    public static synchronized MySun3 getSun(){
        if(sun == null){
            sun = new MySun3();
        }
        return sun;
    }

}
