package io.github.mikeiansky.async.autoconfigure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mike ian
 * @date 2024/8/13
 * @desc 类型配置
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AsyncPoolTypeProperties {

    private int core;
    private int max;
    private int queueCapacity;
    private int keepAlive;
    private String prefix;

}
