package pl.vabank.game.access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// import org.springframework.data.repository.CrudRepository;
import pl.vabank.game.data.RoomData;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RoomRepository extends JpaRepository<RoomData, Long> {
    // @Query("SELECT u FROM UserData u WHERE u.email = ?1")
    // public RoomData findByEmail(String email);
}
