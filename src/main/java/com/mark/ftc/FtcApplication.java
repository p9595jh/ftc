package com.mark.ftc;

import com.mark.ftc.util.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class FtcApplication {

    @Autowired
    private Enroll e;

    @PostConstruct
    public void init() throws Exception {
        System.setProperty("org.hyperledger.fabric.sdk.service_discovery.as_localhost", "true");
//        e.doEnroll();
        e.setConnection();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FtcApplication.class, args);
    }

}
