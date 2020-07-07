package com.spring_security.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	com.spring_security.configuration.CustomSuccessHandler customSuccessHandler;

	/*https://james.codegym.vn/mod/assign/view.php?id=2565
	Phương thức Override configure(AuthenticationManagerBuilder auth)
	cấu hình xác thực bộ nhớ với thông tin đăng nhập và vai trò của người dùng.*/
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("bill").password(passwordEncoder().encode("abc123")).roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("root123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("dba").password(passwordEncoder().encode("root123")).roles("ADMIN","DBA");
	}

	/*Phương thức Override configure(HttpSecurity http) cấu hình bảo mật dựa trên web cho tất cả các yêu cầu HTTP.
	Theo mặc định, nó sẽ được áp dụng cho tất cả các yêu cầu, nhưng có thể bị hạn chế
	bằng cách sử dụng requestMatcher () hoặc các phương thức tương tự khác.*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	  http.authorizeRequests()
	  	.antMatchers("/", "/home").access("hasRole('USER')")
	  	.antMatchers("/admin/**").access("hasRole('ADMIN')")
	  	.antMatchers("/dba/**").access("hasRole('ADMIN') ")
	  	.and().formLogin().successHandler(customSuccessHandler)
	  	.usernameParameter("ssoId").passwordParameter("password")
	  	.and().csrf()
	  	.and().exceptionHandling().accessDeniedPage("/Access_Denied");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
