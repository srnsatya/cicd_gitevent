package com.cicd.gitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/jt")
public class GitActionApplication {

	@GetMapping("/cicdgitaction")
	public String cicdaction(){

		return "cicid git actions is working";
	}

	/*
	echo "# spring-javatechie-cicd-git-action" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/srnsatya/spring-javatechie-cicd-git-action.git
	git push -u origin main

	 */
	public static void main(String[] args) {
		SpringApplication.run(GitActionApplication.class, args);
	}

}
