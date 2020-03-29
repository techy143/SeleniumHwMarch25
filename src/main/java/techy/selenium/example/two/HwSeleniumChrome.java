package techy.selenium.example.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwSeleniumChrome {


        public static void main(String[] args) throws Exception{

            regChrome();

        }


        public static void regChrome () throws Exception{
            System.setProperty("webdriver.chrome.driver","/Users/tuhidzmac/Projects/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demo.broadleafcommerce.org/login");
            System.out.println(driver.getTitle());




            WebElement Email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[1]/div[2]/input"));
            Email.clear();
            System.out.println("Box cleared");
            Email.sendKeys("tauhidechy@outlook.com");
            System.out.println("Input Email Address");
            Thread.sleep(3000);



            WebElement FirstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[2]/div[2]/input"));
            FirstName.clear();
            System.out.println("Box cleared");
            FirstName.sendKeys("Tauhid");
            System.out.println("Input First Name");
            Thread.sleep(3000);



            WebElement LastName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[3]/div/input"));
            LastName.clear();
            System.out.println("Box cleared");
            LastName.sendKeys("Chowdhury");
            System.out.println("Input Last Name ");
            Thread.sleep(3000);



            WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[4]/div[2]/input"));
            Password.clear();
            System.out.println("Box cleared");
            Password.sendKeys("Canada143");
            System.out.println("Enter ur Password ");
            Thread.sleep(3000);



            WebElement ConfirmPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[5]/div/input"));
            ConfirmPassword.clear();
            System.out.println("Box cleared");
            ConfirmPassword.sendKeys("Canada143");
            System.out.println("Enter ur password again");
            Thread.sleep(3000);



            WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/button"));
            Reg.click();
            System.out.println("Click Register Bottom");
            Thread.sleep(3000);

            driver.quit();

        }

    }