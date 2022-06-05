package pl.vabank.game.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pl.vabank.game.CustomUserDetails;
import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.access.RoomRepository;
import pl.vabank.game.access.UserRepository;
import pl.vabank.game.data.QuestionsData;
import pl.vabank.game.data.RoomData;
import pl.vabank.game.data.UserData;

/**
 * 
 * Opis klasu co tu sie dzieje 
 * @author Katarzyna Madalińska <br> 
 *
 * 
 * 
 *Cały moduł odpowiedzialny jest kolejno za <br> 
 *- rejestracje użtowników showRegistrationForm <br>
 *- login
 */
@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoomRepository roomRepo;
    @Autowired
    private QuestionsRepository questRepo;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserData());

        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(UserData user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<UserData> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @GetMapping("/rooms")
    public String listRooms(Model model) {
        List<RoomData> listRooms = roomRepo.findAll();

        Collections.sort(listRooms, new Comparator<RoomData>() {

            public int compare(RoomData o1, RoomData o2) {
                // compare two instance of `Score` and return `int` as result.
                return o1.getId().compareTo(o2.getId());
            }
        });

        // TODO dołączanie
        // for(RoomData room: listRooms){

        // if (room.getPlayer1() != null && room.getPlayer2() != null){

        // }

        // }
        Boolean[] roomsStatus = new Boolean[listRooms.size()];
        int roomIndex = 0;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // osoba która

        Object currentPrincipalObject = authentication.getPrincipal();// currentPrincipalObject-pobiera

        UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();

        for (RoomData room : listRooms) {
            roomsStatus[roomIndex] = false;
            if (currentUser.getId().equals(room.getPlayer1().getId())) {
                
                if((room.getActivRoom()&1)>0){
                    roomsStatus[roomIndex] = true;
                }
            } else if (room.getPlayer2() != null && currentUser.getId().equals(room.getPlayer2().getId())) {
                if((room.getActivRoom()&2)>0){
                    roomsStatus[roomIndex] = true;
                }
            } else if (room.getPlayer2() == null) {
                roomsStatus[roomIndex] = true;
            }

            roomIndex++;
        }
        model.addAttribute("roomsStatus", roomsStatus);
        model.addAttribute("listRooms", listRooms);

        return "rooms";
    }
/**
 * 
 * 
 * 
 * @param model
 * @return
 */
    @GetMapping("/create_room")
    public String createRoom(Model model) {

        ArrayList<Pair<String, Integer>> dbConfigMap = new ArrayList<Pair<String, Integer>>() {
            {
                add(Pair.with("GIT", 100));
                add(Pair.with("GIT", 200));
                add(Pair.with("GIT", 300));
                add(Pair.with("GIT", 400));
                add(Pair.with("GIT", 500));

                add(Pair.with("kolekcje mapy strumienie", 100));
                add(Pair.with("kolekcje mapy strumienie", 200));
                add(Pair.with("kolekcje mapy strumienie", 300));
                add(Pair.with("kolekcje mapy strumienie", 400));
                add(Pair.with("kolekcje mapy strumienie", 500));

                add(Pair.with("Wątki", 100));
                add(Pair.with("Wątki", 200));
                add(Pair.with("Wątki", 300));
                add(Pair.with("Wątki", 400));
                add(Pair.with("Wątki", 500));

                add(Pair.with("Podstawowe elementy języka java", 100));
                add(Pair.with("Podstawowe elementy języka java", 200));
                add(Pair.with("Podstawowe elementy języka java", 300));
                add(Pair.with("Podstawowe elementy języka java", 400));
                add(Pair.with("Podstawowe elementy języka java", 500));

                add(Pair.with("java", 100));
                add(Pair.with("java", 200));
                add(Pair.with("java", 300));
                add(Pair.with("java", 400));
                add(Pair.with("java", 500));
            }
        };

        List<QuestionsData> allQuestions = new ArrayList<QuestionsData>();
        Random rand = new Random();
        for (Pair<String, Integer> element : dbConfigMap) {
            QuestionsData exmp = new QuestionsData();// ob. sql ma cene i kategorie

            exmp.setNameCategory(element.getValue0());
            exmp.setPriceCategory(element.getValue1());

            Example<QuestionsData> example = Example.of(exmp);

            List<QuestionsData> actual = questRepo.findAll(example);// pobiera 5 pytan dla kategorii i ceny
            int randIdx = rand.nextInt(actual.size());
            allQuestions.add(actual.get(randIdx));
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object currentPrincipalObject = authentication.getPrincipal();
        UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();

        RoomData newRoom = new RoomData(0L, 3, 1, currentUser, 0, null, 0, allQuestions);

        roomRepo.save(newRoom);

        return "redirect:rooms";
    }
}
