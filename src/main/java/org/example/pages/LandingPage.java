package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LandingPage extends BasePage {

    public static final String URL = "https://the-internet.herokuapp.com/";

//    @FindBy(xpath = "//div[@id='content']/ul/li")
//    List<WebElement> linkList;

    By locator = By.xpath("//div[@id='content']/ul/li/a");
    List<Integer> listOfIndexes = new ArrayList<>();
    List<WebElement> allElements = new ArrayList<>();


    public LandingPage open() {
        driver.get(URL);
        driver.manage().window().maximize();

        allElements = getWebElementsList(locator);

        return this;
    }

    public List<WebElement> getLinkList() {
        List<WebElement> stringList = getWebElementsList(locator);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        return stringList;
    }

    public LandingPage printRandomElements() {
        Random random = new Random();

//        List<WebElement> allElements = getWebElementsList(locator);
        int numberOfElements = allElements.size();

        int randomElement1 = random.nextInt(numberOfElements);
        listOfIndexes.add(0, randomElement1);
        System.out.println(allElements.get(randomElement1).getText() + ": " + allElements.get(randomElement1).getAttribute("href"));

        int randomElement2 = random.nextInt(numberOfElements);
        listOfIndexes.add(1, randomElement2);
        System.out.println(allElements.get(randomElement2).getText() + ": " + allElements.get(randomElement2).getAttribute("href"));

        int randomElement3 = random.nextInt(numberOfElements);
        listOfIndexes.add(2, randomElement3);
        System.out.println(allElements.get(randomElement3).getText() + ": " + allElements.get(randomElement3).getAttribute("href"));
        return this;
    }

    public void clickFirstElement() {
        allElements.get(listOfIndexes.get(0)).click();
    }


}


//    public LandingPage waitForElementsToLoad(){
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='content']/ul/li")));
//        return this;
//    }


