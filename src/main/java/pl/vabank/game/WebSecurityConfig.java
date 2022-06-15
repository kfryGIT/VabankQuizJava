package pl.vabank.game;

import javax.sql.DataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * Klasa WebSecurityConfig służy do konfiguracji Spring Security.
 * W metodzie configure() użytkownik musi się zalogować, 
 * aby zobaczyć stronę z widokiem.html ("users"), ("rooms"),("game_room"), ("question"). 
 * W tej klasie konfigurowana jest również domyślną stronę logowania (generowana przez Spring Security)- formLogin(),
 * z parametrem usernameParameter tj. email.
 * Domyślnym adresem URL sukcesu logowania to ("rooms"),
 * co oznacza, że ​​po udanym zalogowaniu użytkownik zostanie przekierowany na stronę z widokiem.html ("rooms").
 * Zaś ​​po udanym wylogowaniu (.logoutSuccessUrl) użytkownik zostanie przekierowany na stronę z widokiem.html ("hoom"),
 * z adresem URL "/".
 * 
* @author klasa konfiguracyjna generowana przez Springa modyfikacje wprowadziła Katarzyna Madalińska
*/
 
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
     
    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
            .antMatchers("/users").authenticated()
            .antMatchers("/rooms").authenticated()
            .antMatchers("/game_room/*").authenticated()
            .antMatchers("/question/*/*").authenticated()
            .anyRequest().permitAll()
            .and()
            .formLogin()
                .usernameParameter("email")
                .defaultSuccessUrl("/rooms")
                .permitAll()
            .and()
            .logout().logoutSuccessUrl("/").permitAll();
    } 
}
