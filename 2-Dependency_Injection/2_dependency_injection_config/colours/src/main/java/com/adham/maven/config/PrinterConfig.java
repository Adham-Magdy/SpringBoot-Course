package com.adham.maven.config;

import com.adham.maven.services.BluePrinter;
import com.adham.maven.services.ColourPrinter;
import com.adham.maven.services.GreenPrinter;
import com.adham.maven.services.RedPrinter;
import com.adham.maven.services.impl.ColourPrinterImpl;
import com.adham.maven.services.impl.SpanishBluePrinter;
import com.adham.maven.services.impl.SpanishGreenPrinter;
import com.adham.maven.services.impl.SpanishRedPrinter;
import com.deviro.maven.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

  @Bean
  public BluePrinter bluePrinter() {
    return new SpanishBluePrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new SpanishRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new SpanishGreenPrinter();
  }

  @Bean
  public ColourPrinter colourPrinter(
      BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
    return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}
