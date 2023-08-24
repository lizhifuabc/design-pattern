package com.tomato.structural.twin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 兄弟对象
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Getter
@Setter
@AllArgsConstructor
public class TwinObject {
    private int value;
    public void updatePrimary(PrimaryObject primary) {
        primary.setValue(value);
    }
}
