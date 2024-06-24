package nz.co.stylesoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import nz.co.stylesoftware.service.IAccountDetailsService;

@SpringBootApplication
public class SpringDataJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaRepositoryApplication.class, args);
		
		IAccountDetailsService service =context.getBean(IAccountDetailsService.class);
		System.out.println(service.getById(2));
		context.close();
	}

}
