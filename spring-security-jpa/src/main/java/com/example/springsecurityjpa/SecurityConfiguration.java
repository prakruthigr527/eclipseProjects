package com.example.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       /* auth.inMemoryAuthentication().withUser("mother").password("gowri").roles("ADMIN").
                and().withUser("father").password("sumanth").roles("USER");*/
       auth.jdbcAuthentication()
               .dataSource(dataSource) /*next step is optional when using different schema*/
               .usersByUsernameQuery("select username, password, enabled "
               + "from users " + "where username = ?")
               .authoritiesByUsernameQuery("select username, authority "
                       + "from authorities " + "where username = ?") ;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
               .antMatchers("/admin").hasRole("ADMIN")
               .antMatchers("/user").hasAnyRole("USER","ADMIN")
               .antMatchers("/").permitAll()
               .and().formLogin();
    }
}
