package org.example.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringComponentScan")
@SpringBootApplication(scanBasePackages = {"${pro.info.base-package}.server", "${pro.info.base-package}.module"})
public class ProServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProServerApplication.class);
    }
}
