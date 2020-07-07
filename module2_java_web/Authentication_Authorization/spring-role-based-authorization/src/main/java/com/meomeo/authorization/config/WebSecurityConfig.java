package com.meomeo.authorization.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration //xác định lớp WebSecurityConfig của ta là một lớp dùng để cấu hình.
@EnableWebSecurity //sẽ kích hoạt việc tích hợp Spring Security với Spring MVC.
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean //việc mã hóa mật khẩu sẽ do interface PasswordEncoder đảm nhận
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	//xác thực bộ nhớ với thông tin đăng nhập và vai trò của người dùng
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    //cấu hình các chi tiết về bảo mật:
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //Phân quyền request
            .authorizeRequests()
                .antMatchers("/register").permitAll()
                .antMatchers("/").hasRole("MEMBER")
                .antMatchers("/admin").hasRole("ADMIN")
                .and()
                //Đăng nhập
            .formLogin()
            	.loginPage("/login")
            	.usernameParameter("email")
            	.passwordParameter("password")
            	.defaultSuccessUrl("/")
            	.failureUrl("/login?error")
            	.and()
        	.exceptionHandling()
    			.accessDeniedPage("/403");
    }
	
}
