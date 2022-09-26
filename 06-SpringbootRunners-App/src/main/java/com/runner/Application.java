package com.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	ApplicationRunner appRunner()
	{
		return args-> System.out.println("++Lamda :: App Runner++");	
	}
	@Bean
	CommandLineRunner cmdRunner()
	{
		return args-> System.out.println("++Lamda :: cmd Runner++");	
	}
@Override
public void run(ApplicationArguments args) throws Exception {
	System.out.println("+++StartClass-AppRunner->run++");
}
public void run(String... args) throws Exception
{
	  System.out.println("+++StartClass-CmdRunner->run++");
}
}
