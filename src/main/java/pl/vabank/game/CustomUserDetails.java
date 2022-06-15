package pl.vabank.game;

import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import pl.vabank.game.data.UserData;


/**
 * Aby zaimplementować funkcję uwierzytelniania (logowania), utworzono  
 * klasę CustomUserDetails imlpementującą UserDetails (zdefiniowaną przez Spring Security) 
 * reprezentującą użytkownika uwierzytelniającego. 
 * Spring Security będzie wywoływał metody w tej klasie podczas procesu uwierzytelniania.
 * Uwierzytelnianie (ang. authentication) – proces polegający na potwierdzeniu
 * zadeklarowanej tożsamości podmiotu biorącego udział w procesie komunikacji. 
 * Celem uwierzytelniania jest uzyskanie określonego poziomu pewności, 
 * że dany podmiot jest w rzeczywistości tym, za który się podaje.


* @author klasa konfiguracyjna generowana przez Springa
*/
 
public class CustomUserDetails implements UserDetails {
 
    private UserData user;
     
    public CustomUserDetails(UserData user) {
        this.user = user;
    }

    public UserData getUser(){
        return user;
    } 

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
 
    @Override
    public String getPassword() {
        return user.getPassword();
    }
 
    @Override
    public String getUsername() {
        return user.getEmail();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
     
    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }
 
}