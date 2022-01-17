package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {

  @BeforeSuite
  public void beforeSuite() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @AfterClass
  public void afterClass() {
  }

  @AfterSuite
  public void afterSuite() {
  }
}
