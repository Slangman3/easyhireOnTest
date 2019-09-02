//package tests;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import pages.EasyhireMainPage;
//import pages.LoginPageFactory;
//
//import java.util.concurrent.TimeUnit;
//
//public class QuestionSetTest {
//    ChromeDriver driver;
//    LoginPageFactory LoginPage;
//
//    @BeforeClass
//    public void openDriver() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void questionSetOnCheck() throws InterruptedException {
//        EasyhireMainPage easy = new EasyhireMainPage(driver);
//        LoginPageFactory loginPage = new LoginPageFactory(driver);
//        loginPage
//                .openPage()
//                .login("tms2@mailinator.com", "Password01");
//        easy.goToQuestionsPage();
//        easy.addNewQuestionSetByPlusBtn("New_set_1");
//
//
//        //login
//        //CLICK MENU
//        //CLICK add
//        //FIL IN NAME
//        //CHECK CHECKBOX
//        //CLICK SAVE
//        //validate question set in drop down
//    }
//
//    @AfterClass
//    public void closeDriver() {
//        driver.quit();
//    }
//}
