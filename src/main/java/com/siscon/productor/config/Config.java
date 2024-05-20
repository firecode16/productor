package com.siscon.productor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Fredi
 * 
 */
@Configuration
@ComponentScan("com.siscon.productor")
@EnableJpaRepositories("com.siscon.productor.repository")
public class Config {
}
