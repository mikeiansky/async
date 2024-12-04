package io.github.mikeiansky.async.annotation;

import io.github.mikeiansky.async.AsyncPoolType;
import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.scheduling.annotation.Async;

import java.lang.annotation.*;

/**
 * @author mike ian
 * @date 2024/8/7
 * @desc 核心线程池注解
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Reflective
@Async(value = AsyncPoolType.CORE)
public @interface AsyncCore {

}
