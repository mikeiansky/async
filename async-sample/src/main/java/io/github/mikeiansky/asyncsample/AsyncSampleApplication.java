package io.github.mikeiansky.asyncsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AsyncSampleApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = SpringApplication.run(AsyncSampleApplication.class, args);
        AsyncSampleService asyncSampleService = applicationContext.getBean(AsyncSampleService.class);
        asyncSampleService.testCoreAsyncAnnotation();
        asyncSampleService.testCoreAsyncService();
        asyncSampleService.testAssistAsyncAnnotation();
        asyncSampleService.testAssistAsyncService();

        Thread.sleep(2000);
    }

}
