package org.example.pages;

import org.example.infra.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BasePage{

  public final WebDriver driver = Context.getDriver();


  public List<WebElement> getWebElementsList(By locator){

    return driver.findElements(locator);

  }

  public String getWebElementsText(By locator){
    return driver.findElement(locator).getText();
  }

  public String getWebElementsLink(By locator){
    return driver.findElement(locator).getAttribute("href");
  }


}
