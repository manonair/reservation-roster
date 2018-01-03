package com.mt.rrs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author m1015830
 */
@Configuration
public class HotelManagementApiConfiguration {

    @Value("${hotelManagementApiClient.serviceUrl:}")
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;
   
   
    
    
    
}
