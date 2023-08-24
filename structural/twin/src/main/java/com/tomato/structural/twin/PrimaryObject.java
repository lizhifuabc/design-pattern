package com.tomato.structural.twin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 主对象
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Getter
@Setter
@AllArgsConstructor
public class PrimaryObject {
    private int value;
    public void updateTwin(TwinObject twin) {
        twin.setValue(value);
    }
}
