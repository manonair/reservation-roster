package com.mt.rrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author m1015830
 * ReservationRosterApplication !
 *
 */


@SpringBootApplication
@EnableConfigurationProperties
public class ReservationRosterApplication 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(ReservationRosterApplication.class, args);
    }
}
