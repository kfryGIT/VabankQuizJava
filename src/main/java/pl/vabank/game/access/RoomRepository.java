package pl.vabank.game.access;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.vabank.game.data.RoomData;



public interface RoomRepository extends JpaRepository<RoomData, Long> {
   
}
