package io.github.mikeiansky.async.autoconfigure;

import io.github.mikeiansky.async.AsyncPoolType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author mike ian
 * @date 2024/8/13
 * @desc 线程池配置参数
 **/
@ConfigurationProperties(prefix = "io.github.mikeiansky.async")
@Data
public class AsyncPoolProperties {

    private AsyncPoolTypeProperties core = new AsyncPoolTypeProperties(
            5, 10, 1024, 60, AsyncPoolType.CORE_PREFIX
    );
    private AsyncPoolTypeProperties assist = new AsyncPoolTypeProperties(
            8, 16, 1024, 60, AsyncPoolType.ASSIST_PREFIX
    );

}
