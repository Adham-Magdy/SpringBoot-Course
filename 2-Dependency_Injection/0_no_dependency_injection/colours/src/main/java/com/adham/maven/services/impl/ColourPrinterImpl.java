package com.adham.maven.services.impl;

import com.adham.maven.services.BluePrinter;
import com.adham.maven.services.ColourPrinter;
import com.adham.maven.services.GreenPrinter;
import com.adham.maven.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  public ColourPrinterImpl() {
    this.redPrinter = new EnglishRedPrinter();
    this.bluePrinter = new EnglishBluePrinter();
    this.greenPrinter = new EnglishGreenPrinter();
  }

  @Override
  public String print() {
    return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
