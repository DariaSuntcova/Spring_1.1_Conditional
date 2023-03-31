package ru.netology.springbootconditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootconditional.profile.DevProfile;
import ru.netology.springbootconditional.profile.ProductionProfile;
import ru.netology.springbootconditional.profile.SystemProfile;

@Configuration

public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev",
            havingValue = "true")
    public SystemProfile devProfile() {
        System.out.println("devProfile");
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev",
            havingValue = "false")
    public SystemProfile prodProfile() {
        System.out.println("prodProfile");
        return new ProductionProfile();
    }
}
