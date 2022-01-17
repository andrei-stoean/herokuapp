package org.example.infra;

import java.io.File;

public enum BrowserType {

  CHROME("chrome"),
  FIREFOX("gecko");

  private final String driverName;

  BrowserType(String driverName) {
    this.driverName = driverName;
  }

  public String getDriverType() {
    return "webdriver." + driverName + ".driver";
  }

  public String getDriverPath() {
    StringBuilder driverPath = new StringBuilder("src/main/resources/drivers/");
    driverPath.append(driverName);
    driverPath.append("driver");
    if (File.separator.equals("\\")) {
      driverPath.append(".exe");
    }
    return driverPath.toString();
  }
}
