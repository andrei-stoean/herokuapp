package org.example.pages;

import org.example.infra.Context;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

  private final WebDriver driver = Context.getDriver();
}
