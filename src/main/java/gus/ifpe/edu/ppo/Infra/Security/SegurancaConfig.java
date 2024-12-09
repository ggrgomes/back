package gus.ifpe.edu.ppo.Infra.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {

	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
 
		http.authorizeHttpRequests(customizer -> {
           customizer.anyRequest().permitAll();
		});
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.cors(Customizer.withDefaults());
		http.csrf(customizer -> customizer.disable());

		return http.build();
	}
	

}
