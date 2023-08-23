package com.tomato.creational.singleton;

/**
 * 基于枚举的单例实现
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public enum EnumIvoryTower {
    /**
     * 实例
     */
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
