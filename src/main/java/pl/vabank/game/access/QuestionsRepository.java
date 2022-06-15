package pl.vabank.game.access;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.vabank.game.data.QuestionsData;

public interface QuestionsRepository extends JpaRepository<QuestionsData, Long>{
 

}
