package com.adham.maven.services.impl;

import com.adham.maven.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "verde";
  }
}
