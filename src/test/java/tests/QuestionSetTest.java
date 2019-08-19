package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.EasyhireMainPage;

import java.util.concurrent.TimeUnit;

public class QuestionSetTest {
    ChromeDriver driver;

    @BeforeClass
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void questionSetOnCheck(){
        EasyhireMainPage easy = new EasyhireMainPage(driver);
        easy.openPage();
        easy.goToQuestionsPage();
    }

//    @AfterClass
//    public void closeDriver() {
//        driver.quit();
//    }
}
