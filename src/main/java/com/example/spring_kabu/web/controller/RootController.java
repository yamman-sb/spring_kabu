package com.example.spring_kabu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
  @GetMapping("/")
  public String root() { return "redirect:stock/index"; }
}
