package org.example.infra;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;

public class Context {

  private static final Map<String, Object> CONTEXT_DATA = new HashMap<>();

  private Context() {
  }

  public static WebDriver getDriver() {
    return (WebDriver) CONTEXT_DATA.get("driver");
  }

  public static void setDriver(WebDriver driver) {
    CONTEXT_DATA.put("driver", driver);
  }
}
