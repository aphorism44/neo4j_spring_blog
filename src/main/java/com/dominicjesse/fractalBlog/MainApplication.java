package com.dominicjesse.fractalBlog;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;



@SpringBootApplication
//@EnableNeo4jRepositories
public class MainApplication {
	

    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}
	/*
	@Bean
	Configuration cypherDslConfiguration() {
		return Configuration.newConfig().withDialect(Dialect.NEO4J_5).build();
	}
	
	@Bean
	public ViewResolver viewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("classpath:/templates/");
	    resolver.setSuffix(".html");
	    return resolver;
	}*/
}
