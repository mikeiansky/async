package io.github.mikeiansky.asyncsample;

import io.github.mikeiansky.async.AsyncService;
import io.github.mikeiansky.async.annotation.AsyncAssist;
import io.github.mikeiansky.async.annotation.AsyncCore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mike ian
 * @date 2024/12/3
 * @desc
 **/
@Slf4j
@Service
public class AsyncSampleService {

    private final AsyncService asyncService;

    public AsyncSampleService(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @AsyncCore
    public void testCoreAsyncAnnotation(){
        log.info("testCoreAsync with annotation");
    }

    public void testCoreAsyncService(){
        asyncService.runWithCore(() -> log.info("testCoreAsync with service"));
    }

    @AsyncAssist
    public void testAssistAsyncAnnotation(){
        log.info("testAssistAsync with annotation");
    }

    public void testAssistAsyncService(){
        asyncService.runWithHelp(() -> log.info("testAssistAsync with service"));
    }

}
