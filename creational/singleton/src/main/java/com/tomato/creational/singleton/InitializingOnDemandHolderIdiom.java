package com.tomato.creational.singleton;

/**
 * 提供了一个不依赖 java 版本和一些关键字的方式来实现线程安全的单例模式
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class InitializingOnDemandHolderIdiom {
    /**
     *
     * 私有构造函数，因此没有人可以实例化该类。
     */
    private InitializingOnDemandHolderIdiom() {
    }

    /**
     *
     * 单例实例化。
     * @return Singleton instance
     */
    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    /**
     *
     * 提供延迟加载的单例实例。
     * 内部类可以延时加载。如果直接使用静态变量，因为加载子类等其它原因对实例进行了初始化，而此时并不需要该类的实例，造成了资源的浪费。
     */
    private static class HelperHolder {
        /**
         * static 强调只有一份，final 说明是一个常量
         */
        private static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }
}
