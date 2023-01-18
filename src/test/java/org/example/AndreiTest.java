package org.example;

import org.example.pages.LandingPage;
import org.testng.annotations.Test;

public class AndreiTest extends BaseUITest {

    @Test
    public void printThreeRandomLinks() {
        LandingPage lp = (LandingPage) new LandingPage().open();

        lp.printRandomElements();
    }


    @Test
    public void clickFirstLink() {
        LandingPage lp = new LandingPage().open();

        lp.printRandomElements().clickFirstElement();
    }
}
