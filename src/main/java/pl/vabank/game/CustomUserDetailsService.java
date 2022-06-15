package pl.vabank.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import pl.vabank.game.access.UserRepository;
import pl.vabank.game.data.UserData;
 

/**
 * Klasę CustomUserDetailsService, która implementuje interfejs UserDetailsService, utworzono  
 * aby "powiedzieć" Spring Security, jak wyszukiwać informacje o użytkowniku, 
 * Spring Security wywoła metodę loadUserByUsername() w celu uwierzytelnienia użytkownika, 
 * a jeśli metoda się powiedzie, zostanie utworzony nowy obiekt typu CustomUserDetails reprezentujący uwierzytelnionego użytkownika.

* @author klasa konfiguracyjna generowana przez Springa
*/
public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepo;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
 
}