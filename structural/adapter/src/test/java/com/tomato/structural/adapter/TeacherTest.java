package com.tomato.structural.adapter;

/**
 * TeacherTest
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Schedule schedule = new TeacherAdapter(teacher);
        // 调用适配后的方法
        schedule.getDailySchedule();
    }
}
