//package com.example.Blog_App.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Override
//	protected void configure (HttpSecurity http)throws Exception{
//		http.csrf().disable().authorizeHttpRequests().anyRequest().authenticated().and().httpBasic();
//		
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.userDetailsService(this.customUserDetailService).passwordEncoder(null);
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	
//}
