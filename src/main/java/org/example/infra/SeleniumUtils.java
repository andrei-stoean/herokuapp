package org.example.infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtils {

  private SeleniumUtils() {
  }

  public static WebDriver getWebDriver(BrowserType targetBrowser) {
    System.setProperty(targetBrowser.getDriverType(), targetBrowser.getDriverPath());
    return switch (targetBrowser) {
      case CHROME -> new ChromeDriver();
      case FIREFOX -> new FirefoxDriver();
    };
  }
}
