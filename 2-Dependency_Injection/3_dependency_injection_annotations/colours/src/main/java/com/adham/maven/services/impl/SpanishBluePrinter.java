package com.adham.maven.services.impl;

import com.adham.maven.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "azul";
  }
}
