package com.tomato.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Teacher适配到Schedule接口
 * 适配器模式让原本不兼容的Teacher和Schedule可以一起工作,而不需要修改其代码,很好地解耦了两者。
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class TeacherAdapter implements Schedule{
    private final Teacher teacher;

    public TeacherAdapter(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void getDailySchedule() {
        teacher.teachLesson();
    }
}
