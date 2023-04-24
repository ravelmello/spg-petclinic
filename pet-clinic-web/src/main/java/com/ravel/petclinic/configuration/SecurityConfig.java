package com.ravel.petclinic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails userOwner = User.withUsername("owner").password(passwordEncoder().encode("ownerPass")).roles("USER").build();
        UserDetails userVet = User.withUsername("vet").password(passwordEncoder().encode("vetPass")).roles("USER").build();
        UserDetails userAdmin = User.withUsername("admin").password(passwordEncoder().encode("adminPass")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(userOwner, userAdmin, userVet);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers()
                .hasRole("ADMIN")
                .antMatchers("/owners/*")
                .hasRole("OWNER")
                .antMatchers("/veterinarian/*")
                .hasRole("VETERINARIAN")
                .antMatchers("/login")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .loginProcessingUrl("/perform_login")
                .failureUrl("/login")
                .and()
                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID");

        return http.build();
    }


}
