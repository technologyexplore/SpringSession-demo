package com.share.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
@ComponentScan("com.share")
public class MainApp {
	/**
	 * @Title: main
	 * @param: args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}
}
