package com.ddxx.springmvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

  @RequestMapping(value="index",method = GET)
  public String home(Model model) {
    return "home";
  }

}
