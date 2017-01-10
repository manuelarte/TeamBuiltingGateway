package org.manuel.teambuilting.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TeamBuiltingGatewayApplication {

	public static void main(final String[] args) {
		SpringApplication.run(TeamBuiltingGatewayApplication.class, args);
	}

}
