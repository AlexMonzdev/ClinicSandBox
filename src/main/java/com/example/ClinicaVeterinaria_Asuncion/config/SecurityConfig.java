package com.example.ClinicaVeterinaria_Asuncion.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {


    private static final String[] AUTH_WHITE_LIST = {
            "api/v1/home/**",
            "api/v1/admin/**",
            "/h2/**"
    };


        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
          return http
                  .cors(Customizer.withDefaults())
                  .csrf(csrf -> csrf.disable())
                  .formLogin(form -> form.disable())
                  .authorizeHttpRequests(auth -> auth
                          .requestMatchers(AUTH_WHITE_LIST).permitAll()
                          .anyRequest().hasRole("ADMIN"))
                  .httpBasic(Customizer.withDefaults())
                  .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED))
                    /*.authorizeHttpRequests()
                    .requestMatchers(AUTH_WHITE_LIST).permitAll()
                    .anyRequest().hasRole("ADMIN")
                    .and()
                    .formLogin(form -> form.disable())
                    .csrf().ignoringRequestMatchers("/h2/**")
                    .and()
                    .headers().frameOptions().sameOrigin()
                    .and()*/
                    .build();
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("1234"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

    }








