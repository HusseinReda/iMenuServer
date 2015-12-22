package com.iMenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials;
import org.springframework.cloud.aws.context.config.annotation.EnableContextRegion;
import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableRdsInstance(databaseName="imenudb", dbInstanceIdentifier="imenudb", username="asciichart",password="asciichart")
@EnableContextCredentials(accessKey="AKIAID7TMHP76YHKFJGA", secretKey="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")
@EnableContextRegion(region = "eu-central-1")
public class Application extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
