package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class LineLoginApplication {
    public static void main(final String... args) throws Exception {
        SpringApplication.run(LineLoginApplication.class, args);
    }

    @GetMapping("/")
    public Object whoami(final OAuth2Authentication oAuth2Authentication) {
        return oAuth2Authentication;
    }
}
