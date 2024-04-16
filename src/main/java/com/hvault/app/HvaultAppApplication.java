package com.hvault.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class HvaultAppApplication implements CommandLineRunner{
		
	
	private final VaultConfig vaultConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(HvaultAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Logger logger = LoggerFactory.getLogger(HvaultAppApplication.class);
		logger.info("configuration of Hvault properties");
		logger.info("username is {} ", vaultConfig.getUserName());
		logger.info("password is {} ", vaultConfig.getPassword());
		
	}

}
