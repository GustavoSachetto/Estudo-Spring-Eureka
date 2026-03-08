package com.sachetto.sdk.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.sachetto.sdk.client") 
public class SdkAutoConfiguration {

}