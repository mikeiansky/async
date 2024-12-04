package io.github.mikeiansky.async;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author mike ian
 * @date 2024/8/7
 * @desc 异步线程池类型
 **/
public class AsyncPoolType {

    public static final String CORE = "mikeianskyAsyncCore";
    public static final String ASSIST = "mikeianskyAsyncAssist";

    public static final String CORE_PREFIX = "mikeiansky-async-core-";
    public static final String ASSIST_PREFIX = "mikeiansky-async-assist-";

    public static ThreadPoolTaskExecutor createThreadPool(int corePoolSize, int maxPoolSize, int queueCapacity, int keepAliveSeconds, String threadNamePrefix) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setKeepAliveSeconds(keepAliveSeconds);
        executor.setThreadNamePrefix(threadNamePrefix);
        executor.initialize();
        return executor;
    }


}
