package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

  public static void main(String[] args) {
    // trigger error
    System.out.p;
    SpringApplication.run(GithubActionsApplication.class, args);
  }

}
