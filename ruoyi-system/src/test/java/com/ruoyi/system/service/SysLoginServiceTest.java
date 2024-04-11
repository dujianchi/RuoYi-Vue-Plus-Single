package com.ruoyi.system.service;

import cn.dev33.satoken.secure.BCrypt;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SysLoginServiceTest {

    @Test
    void login() {
        String password = "123123123";
        //String hashpw = "$2a$10$cezB16TE3YLTge1TABX8VujFGPykb3Byz/mzdyYALg3lQd3/cElRu";//BCrypt.hashpw(password);
        String hashpw = "$2a$10$/.LaM8Mnmh1x.lyHUObl2.VbmmV9UIiq/BouyI4UjydaCm6AnFiLO";//BCrypt.hashpw(password);
        log.info("hashpw = {}", hashpw);
        boolean checkpw = BCrypt.checkpw(password, hashpw);
        log.info("checkpw = {}", checkpw);
    }

    @Test
    void smsLogin() {
    }

    @Test
    void emailLogin() {
    }

    @Test
    void xcxLogin() {
    }

    @Test
    void logout() {
    }

    @Test
    void validateCaptcha() {
    }

    @Test
    void recordLoginInfo() {
    }
}
