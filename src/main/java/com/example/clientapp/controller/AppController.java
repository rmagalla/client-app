package com.example.clientapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AppController {

  @Value("${saludo}")
  private String saludo;

  @GetMapping(value = "/saludo/{name}")
  public String saludo(@PathVariable("name") String name) {
    System.out.println("Bienvenido " + name + saludo);
    return "Bienvenido " + name + saludo;
  }

}
