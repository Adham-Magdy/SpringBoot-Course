package com.adham.maven.services.impl;

import com.adham.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
