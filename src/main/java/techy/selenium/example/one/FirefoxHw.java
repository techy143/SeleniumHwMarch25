package techy.selenium.example.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxHw {

    public static void main(String[] args) {
        seleniumtwo();

    }
    public static void seleniumtwo(){

        System.setProperty("webdriver.gecko.driver","/Users/tuhidzmac/Projects/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com/");
        String pagetitle=driver.getTitle();

        System.out.println(pagetitle);

        driver.quit();


    }
}
