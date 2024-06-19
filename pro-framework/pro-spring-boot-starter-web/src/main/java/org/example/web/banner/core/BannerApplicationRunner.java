package org.example.web.banner.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import cn.hutool.core.thread.ThreadUtil;
import org.springframework.util.ClassUtils;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


@Slf4j
public class BannerApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ThreadUtil.execute(()->{
            ThreadUtil.sleep(1, TimeUnit.SECONDS);
            log.info("启动成功");
        }
        );
    }

    // TODO 这个是什么意思?
    private static boolean isNotPresent(String className) {
        return !ClassUtils.isPresent(className, ClassUtils.getDefaultClassLoader());
    }
}
