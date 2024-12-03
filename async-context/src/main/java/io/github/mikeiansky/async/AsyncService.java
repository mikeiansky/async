package io.github.mikeiansky.async;

import org.springframework.scheduling.annotation.Async;

/**
 * @author mike ian
 * @date 2024/10/25
 * @desc
 **/
public class AsyncService {

    @Async(AsyncPoolType.CORE)
    public void runWithCore(Runnable action) {
        action.run();
    }

    /**
     * 使用帮助线程执行任务
     *
     * @param action 任务
     */
    @Async(AsyncPoolType.ASSIST)
    public void runWithHelp(Runnable action) {
        action.run();
    }

}
