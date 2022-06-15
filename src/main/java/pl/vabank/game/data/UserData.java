package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

/**
 * Klasa UserData ma adnotację @Entity co wskazuje, że jest to jednostka JPA, 
 * ta jednostka jest mapowana do tabeli o nazwie user_data.
 * Obiekt UserData ma 5 atrybutów (zmiennych): id, mail, password, firstName, lastName.
 * Właściwość obiektu id jest opatrzona adnotacją @Id, dzięki czemu JPA rozpoznaje ją jako identyfikator obiektu. 
 * Właściwość id jest również opatrzona adnotacją @GeneratedValue wskazującą, że identyfikator powinien być generowany automatycznie. 
 * Pozostałe 4 właściwości  mail, password, firstName, lastName, z adnotacją @Column są mapowane na kolumny,
 * które mają takie same nazwy jak same właściwości,
 * W klasie utworzono gettery i settery dla pięciu atrybutów obieku UserData.

*/

@Entity // This tells Hibernate to make a table out of this class
public class UserData {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
   
  @Column(nullable = false, unique = true, length = 45)
  private String email;
   
  @Column(nullable = false, length = 64)
  private String password;
   
  @Column(name = "first_name", nullable = false, length = 20)
  private String firstName;
   
  @Column(name = "last_name", nullable = false, length = 20)
  private String lastName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName(){
    return firstName + ' ' +  lastName;
  }
   
}
