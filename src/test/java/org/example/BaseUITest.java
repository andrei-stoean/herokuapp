package org.example;

import org.example.infra.BrowserType;
import org.example.infra.Context;
import org.example.infra.SeleniumUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseUITest extends BaseTest {

  private final BrowserType targetBrowser = BrowserType.CHROME;

  @BeforeMethod
  @Override
  public void beforeMethod() {
    super.beforeMethod();
    openBrowser();
  }

  @AfterMethod
  @Override
  public void afterMethod() {
    super.afterMethod();
    closeBrowser();
  }

  public void openBrowser() {
    Context.setDriver(SeleniumUtils.getWebDriver(targetBrowser));
    Context.getDriver().manage().window().maximize();
  }

  public void closeBrowser() {
    if (Context.getDriver() != null) {
      Context.getDriver().quit();
    }
  }
}
