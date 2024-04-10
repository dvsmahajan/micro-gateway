package com.dvscorp.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {



    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("productModule", r -> r.path("/api/v1/products")
                        .uri("lb://product-app")
                )

//                .route("customerModule", r -> r.path("/customer/**")
//                        .uri("lb://customer-service")
//                )
                .build();
    }
}
