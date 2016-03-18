package com.graptolite.fun.fiction;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppConfig implements ApplicationContextAware {
	private static ApplicationContext context;

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AppConfig.class);
		context = appContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) {
		context = ctx;
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}

}
