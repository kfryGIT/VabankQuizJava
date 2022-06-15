package pl.vabank.game;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Klasa ServletInitialize rozszerzena klasę SpringBootServletInitializer, 
 * które uruchamia SpringApplication z tradycyjnego archiwum WAR wdrożonego w kontenerze internetowym. 
 * Ta klasa wiąże ziarna m.in. Servlet z kontekstu aplikacji do serwera.
 * Rozszerzenie klasy SpringBootServletInitializer pozwala również skonfigurować aplikację, 
 * poprzez nadpisanie metody configure(). Ta metoda wykorzystuje SpringApplicationBuilder, 
 * aby zarejestrować klasę jako klasę konfiguracyjną.

* @author klasa konfiguracyjna generowana przez Springa
*/

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GameApplication.class);
	}

}
