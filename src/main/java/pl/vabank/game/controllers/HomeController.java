package pl.vabank.game.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pl.vabank.game.access.RoomRepository;
import pl.vabank.game.access.UserRepository;
import pl.vabank.game.data.RoomData;
import pl.vabank.game.data.UserData;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoomRepository roomRepo;

    @GetMapping("")
    public String viewHomePage() {
        return "home";
    }

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
        model.addAttribute("listRooms", listRooms);

        return "rooms";
    }
}
