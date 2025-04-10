package QACodeQuiz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Login_Modal {

    public static FirefoxDriver driver;



    @BeforeTest

    public FirefoxDriver driverInitialize() throws InterruptedException {

        // Create Driver


        System.out.println("Static method");
        driver = new FirefoxDriver();
        // get URL

        driver.get("http://localhost:8080/");
        System.out.println("Great the Browser is opened.");
        driver.manage().window().maximize();
        sleep(3000);

        return driver;
    }
        @Test
        public void LoginModalDisplayed () throws InterruptedException {


            //********* Enter User name *********
            WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
            UserName.sendKeys("SomeUser_name");
            System.out.println("I have set the accurate username");

            sleep(3000);
            //********* Enter Password *********
            WebElement Password = driver.findElement(By.xpath("//input[@placeholder='password']"));
            Password.sendKeys("TopSecret1234!");
            System.out.println("Password setting is complete");

            sleep(3000);
            //********* Login *********
            WebElement Login = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
            Login.click();
            System.out.println("Login...!!!!!");
            sleep(3000);
        }
        @AfterTest
        public void tearDown() {
            if (driver != null) {
                driver.close();
                System.out.println("Browser closed.");
            }
        }


    }




