package com.example.demo;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {

  @Autowired
  MessageRepository messageRepository;


  @Autowired
  UserService userService;

  @Autowired
  UserRepository userRepository;

  @Autowired
  CloudinaryConfig cloudc;


  @GetMapping("/register")
  public String showRegistrationPage(Model model) {
    model.addAttribute("user", new User());
    return "registration";
  }

  @PostMapping("/register")
  public String processRegistrationPage(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {

    if (result.hasErrors()) {
      return "registration";
    } else {
      userService.saveUser(user);
      model.addAttribute("message", "User Account Created");
    }
    return "redirect:/";
  }

  @RequestMapping("/login")
  public String login() {
    return "login";
  }


  @RequestMapping("/")
  public String listMessages(Model model){
    model.addAttribute("messages", messageRepository.findAll());
    if(userService.getUser() != null) {
      model.addAttribute("user_id", userService.getUser().getId());
    }
    return "list";
  }

  @GetMapping("/add")
  public String messageForm(Model model) {
    model.addAttribute("message", new Message());


    return "messageform";
  }

//  @PostMapping("/process")

//  public String processForm(@Valid Message message, BindingResult result, Model model) {
//    if (result.hasErrors()) {
//
//      return "messageform";
//
//
//    }
//
//    message.setUser(userService.getUser());
//    messageRepository.save(message);
//    return "redirect:/";
//  }
  @PostMapping("/process")
  public String processForm(@RequestParam("file") MultipartFile file,@Valid Message message, Model model, BindingResult result) {
    if (result.hasErrors()) {
      return "messageform";
    }
    try {
      Map uploadResult = cloudc.upload(file.getBytes(),
              ObjectUtils.asMap("resourcetype", "auto"));
      message.setHeadshot(uploadResult.get("url").toString());
      messageRepository.save(message);
    } catch (IOException e) {
      e.printStackTrace();
      return "redirect:/add";
    }
    String username = userService.getUser().getUsername();
    message.setUser(userRepository.findByUsername(username));
    messageRepository.save(message);

    return "redirect:/";
  }


  @RequestMapping("/detail/{id}")
  public String showMessage(@PathVariable("id") long id, Model model){
    model.addAttribute("message", messageRepository.findById(id).get());
    if(userService.getUser() != null) {
      model.addAttribute("user_id", userService.getUser().getId());
    }
    return "show";
  }

  @RequestMapping("/update/{id}")
  public String updateMessage(@PathVariable("id") long id, Model model){
    model.addAttribute("message", messageRepository.findById(id).get());
    return "messageform";
  }

  @RequestMapping("/delete/{id}")
  public String delMessage(@PathVariable("id") long id){
    messageRepository.deleteById(id);
    return "redirect:/";
  }

}


