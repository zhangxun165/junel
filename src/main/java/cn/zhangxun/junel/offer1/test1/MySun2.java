package cn.zhangxun.junel.offer1.test1;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2020/6/9 23:33
 */
public class MySun2 {

    /**
     * 懒汉模式的单例：
     * 只有在真正需要的时候才创建，因此称为懒汉；
     * 缺点是只能在单线程情况下适用，不适用多线程；
     * 优点是在单线程的情况下，比较节省资源，需要时才创建；
     */
    private static MySun2 sun;

    private MySun2(){}

    public static MySun2 getSun(){
        if(sun == null){
            sun = new MySun2();
        }
        return sun;
    }

}
