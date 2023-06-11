/**
 * 
 */
package com.customer.rewards.calculations.config;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author nitinjain
 *
 */
@Configuration
public class SpringSecurityConfig {

	@Bean
	public SecurityFilterChain filterChainConfig(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		httpSecurity.httpBasic(withDefaults());
		httpSecurity.csrf().disable();
		return httpSecurity.build();
	}

}
