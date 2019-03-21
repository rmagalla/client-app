package com.example.clientapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConexionController {

  @Value("${db.user}")
  private String userdb;

  @Value("${db.pass}")
  private String passdb;


  @GetMapping(value = "/db")
  public String conn() {
    return "Conectando a la base de datos con user: " + userdb + " y password: " + passdb;
  }

}
