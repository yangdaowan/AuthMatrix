package com.yangdaowan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ycf
 **/
@SpringBootApplication
@Slf4j
public class AuthMatrixStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthMatrixStarterApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  AuthMatrix服务 - 启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
