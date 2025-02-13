package in.sujithchenanath.photoapp.discovery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
		.authorizeHttpRequests()
		.anyRequest().authenticated()// this config applies to any URL																		// pattern and any httprequests
		.and().httpBasic();

		return http.build();
	}
}
