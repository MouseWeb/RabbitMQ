package br.com.mouseweb;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableRabbit
@EnableScheduling
@SpringBootApplication
@ComponentScan("br.com")
public class SpringConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumerApplication.class, args);
	}

}
