package com.tomato.structural.twin;

/**
 * Twin
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class TwinTest {
    public static void main(String[] args) {
        PrimaryObject primary = new PrimaryObject(5);
        TwinObject twin = new TwinObject(10);

        primary.updateTwin(twin);
        System.out.println("主对象 value: " + primary.getValue());
        System.out.println("兄弟对象 value: " + twin.getValue());

        twin.updatePrimary(primary);
        System.out.println("主对象 value: " + primary.getValue());
        System.out.println("兄弟对象 value: " + twin.getValue());
    }
}
