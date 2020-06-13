package cn.zhangxun.junel.offer1.test1;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 23:33
 */
public class MySun1 {

    /**
     * 饿汉模式的单例：
     * 在类被加载的时候就进行对象的创建，急于创建，因此称为饿汉；
     * 缺点是一开始就创建的资源不一定会用的到，比较浪费；
     * 优点是多线程下没有问题，实现也足够简单；
     */
    private static final MySun1 SUN = new MySun1();

    private MySun1(){}

    public static MySun1 getSun(){
        return SUN;
    }

}
