package io.github.mikeiansky.async.autoconfigure;

import io.github.mikeiansky.async.AsyncPoolType;
import io.github.mikeiansky.async.AsyncService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


/**
 * @author mike ian
 * @date 2024/8/7
 * @desc 线程池配置，并且开启异步工具
 **/
@EnableAsync
@Configuration
@EnableConfigurationProperties(AsyncPoolProperties.class)
public class AsyncPoolAutoConfiguration {

    private static ThreadPoolTaskExecutor createThreadPool(AsyncPoolTypeProperties properties) {
        return AsyncPoolType.createThreadPool(
                properties.getCore(),
                properties.getMax(),
                properties.getQueueCapacity(),
                properties.getKeepAlive(),
                properties.getPrefix()
        );
    }

    @ConditionalOnMissingBean(name = AsyncPoolType.CORE)
    @Bean(name = AsyncPoolType.CORE)
    public ThreadPoolTaskExecutor mikeianskyAsyncCoreThreadPool(AsyncPoolProperties asyncPoolProperties) {
        return createThreadPool(asyncPoolProperties.getCore());
    }

    @ConditionalOnMissingBean(name = AsyncPoolType.ASSIST)
    @Bean(name = AsyncPoolType.ASSIST)
    public ThreadPoolTaskExecutor mikeianskyAsyncAssistThreadPool(AsyncPoolProperties asyncPoolProperties) {
        return createThreadPool(asyncPoolProperties.getAssist());
    }

    @Bean
    public AsyncService mikeianskyAsyncService() {
        return new AsyncService();
    }

}
