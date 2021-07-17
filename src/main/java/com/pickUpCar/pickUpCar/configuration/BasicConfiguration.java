//package com.pickUpCar.pickUpCar.configuration;
//
//import com.pickUpCar.pickUpCar.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class BasicConfiguration extends WebSecurityConfigurerAdapter {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public BasicConfiguration(UserSecurityService userDetailsSecurityService) {
//        this.userDetailsSecurityService = userDetailsSecurityService;
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/register").permitAll()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/login/**").permitAll()
//                .antMatchers("/images/**").permitAll()
//                .antMatchers("/home").permitAll()
//                .antMatchers("/css/**").permitAll()
//                .antMatchers("/js/**").permitAll()
//                .antMatchers("/").permitAll()
//                .antMatchers("/books", "/authors").permitAll()
//                .antMatchers("/books/**", "/authors/**", "/**").hasRole("ADMIN")
//                .antMatchers("/users", "/user/**", "/users/**", "/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .failureUrl("/login")
//                .defaultSuccessUrl("/books")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/login")
//                .permitAll();
//
//    }
//
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsSecurityService).passwordEncoder(bCryptPasswordEncoder());
//    }
//
//
//}
//
