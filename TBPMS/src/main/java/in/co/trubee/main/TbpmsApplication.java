package in.co.trubee.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("in.co.*")
@EntityScan("in.co.trubee.employee.domain")
@EnableJpaRepositories("in.co.*")
public class TbpmsApplication {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	{
		LOGGER.debug("class :"+this.getClass()+" method :"+this.getClass().getMethods());
	}
	public static void main(String[] args) {
		SpringApplication.run(TbpmsApplication.class, args);
	}

}

