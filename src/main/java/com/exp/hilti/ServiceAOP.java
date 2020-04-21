package com.exp.hilti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

interface ServiceCallback {
	public void callback(String methodName);
}

interface SearchCallback {
	public void callback(String searchedBook);
}

interface RepositoryCallback {
	public void callback();
}

public class ServiceAOP {
	@Autowired
	ServiceCallback serviceCallback;
	@Autowired
	SearchCallback searchCallback;
	@Autowired
	RepositoryCallback repositoryCallback;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
		config.register(Config.class);
		config.refresh();

		///BookSearchService service = config.getBean(BookSearchService.class);
		//System.out.println(service.bookExists("Book2"));
	}

}

@Configuration
@EnableAspectJAutoProxy
@Import(ServiceAOP.class)
class Config {
	@Bean
	public ServiceCallback serviceCallback() {
		return (methodName) -> System.out.println(methodName);
	}

	@Bean
	public SearchCallback searchCallback() {
		return (book) -> System.out.println(book);
	}

	@Bean
	public RepositoryCallback repositoryCallback() {
		return () -> System.out.println("Repository called!");
	}
}
