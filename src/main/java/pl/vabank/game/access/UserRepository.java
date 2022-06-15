package pl.vabank.game.access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// import org.springframework.data.repository.CrudRepository;
import pl.vabank.game.data.UserData;

/**
 * Interface UserRepository rozszerza interfejs JpaRepository. 
 * Typ jednostki (UserData) i identyfikator(Long), są określone w parametrach ogólnych JpaRepository. 
 * Rozszerzony  interface UserRepository dziedziczy kilka metod pracy od JpaRepository, 
 * w tym metody zapisywania, usuwania i znajdowania użytkowników w bazie danych np.<br>
 * saveAndFlush	- zapisuje encje i wymusza odzwierciedlenie wykonanych operacji (na encjach) w bazie,<br>
 * findAll	- pobiera wszystkie encje zwracając interfejs Iterable.<br>
 * JpaRepository umożliwia również tworzenia własnych zapytań np. (SELECT), poprzez użycie adnotacji @Query.
 * Dodana do interface metoda findByEmail(), zwraca pojedynczy obiekt User na podstawie unikalnego adresu e-mail.

* @author interface generowany przez Springa
*/

public interface UserRepository extends JpaRepository<UserData, Long> {
    @Query("SELECT u FROM UserData u WHERE u.email = ?1")
    public UserData findByEmail(String email);
}
