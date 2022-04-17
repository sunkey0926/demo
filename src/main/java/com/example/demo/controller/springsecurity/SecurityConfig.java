package com.example.demo.controller.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
//@Order(0)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
//			.antMatcher("/user/**") // 대상
			.authorizeRequests()
				.antMatchers("/users/**").authenticated()
			.anyRequest().permitAll()   // authenticated()
				.and()
			.formLogin()
				.and()
			.logout()
				.and()
			.csrf().disable();
		
	}
}

//@Configuration
//@Order(1)
//class DefaultSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//			.antMatcher("**") // 대상
//			.authorizeRequests()
//			.anyRequest().authenticated()   // permitAll()
//				.and()
//			.formLogin()
//				.and()
//			.logout()
//				.and()
//			.csrf().disable();
//		
//	}
//}