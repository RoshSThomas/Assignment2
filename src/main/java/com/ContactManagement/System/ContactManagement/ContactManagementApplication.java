package com.ContactManagement.System.ContactManagement;

import com.ContactManagement.System.ContactManagement.JpaRepo.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagementApplication implements CommandLineRunner {

	@Autowired
	PersonRepo repo;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(ContactManagementApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}",repo.findAll());
	}
}
