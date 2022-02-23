package net.tokareva.apitestdeepbackend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiTestDeepBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new ApiTestDeepBackendApplication().configure(new SpringApplicationBuilder(ApiTestDeepBackendApplication.class)).run(args);
	}

}
