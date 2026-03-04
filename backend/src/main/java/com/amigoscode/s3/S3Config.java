package com.amigoscode.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Configuration
public class S3Config {

    @Value("${aws.region}")
    private String awsRegion;

    @Bean
    public S3Client s3Client(){
        return S3Client.builder()
                .region(Region.SA_EAST_1)
                .build();
    }

}

