// Rodrigo Navarro to Ryanair

package tests;

        import java.util.concurrent.TimeUnit;
        import org.junit.*;
        import static org.junit.Assert.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;
        import scripts.basics;
        import utilities.utilities;


public class ryanair {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    private WebDriver _driver;

    @Before
    public void setUp() throws Exception {

        //When the this script will be OK, the setUp() should be in "Utilities".

        System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
        System.setProperty("webdriver.chrome.driver","lib/chromedriver");
        driver = new ChromeDriver();
        Dimension d = new Dimension(375,667);
        driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testRyanair() throws Exception {

        //When this test will be OK, the definition must be in "Basics", in this section only calls to scrips.

        // I put a lot of "sleeps" because I want reduce mistakes for velocity in this moment.

        // In the first moment there are that close the Cookies Alert manually for the script run OK, because I've a
        // problem with that alert.

        driver.get("https://www.ryanair.com/ie/en/");
        Thread.sleep(4000);
        driver.findElement(By.id("flight-search-type-option-one-way")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From:'])[1]/following::div[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your origin'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your origin'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your origin'])[1]/following::input[1]")).sendKeys("london stansted");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your origin'])[1]/following::div[7]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your destination'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your destination'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your destination'])[1]/following::input[1]")).sendKeys("madrid");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select your destination'])[1]/following::strong[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("dateInput1")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fly out:'])[2]/following::span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun'])[2]/following::span[24]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[1]/following::span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='.'])[4]/following::span[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='London Stansted (STN) - Madrid (MAD)'])[1]/following::h3[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact us'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact us'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Choose your seat'])[1]/following::span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[@id='booking-selection']/article/div[2]/section/div[2]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.popup-msg__button.popup-msg__button--cancel")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div/input")).click();
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div/input")).sendKeys("f5655599@nwytg.net");
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div[2]/password-input/input")).click();
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div[2]/password-input/input")).clear();
        driver.findElement(By.xpath("//div[@id='ngdialog3']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div[2]/password-input/input")).sendKeys("AAaa1234");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='or log in with email address'])[1]/following::translate[1]")).click();
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[2]/input")).sendKeys("Rodrigo");
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[3]/input")).click();
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[3]/input")).clear();
        driver.findElement(By.xpath("//div[@id='checkout']/div/form/div/div/passengers-form/div[2]/ng-form/passenger-input-group/div/ng-form/div/div[3]/input")).sendKeys("Navarro");
        driver.findElement(By.name("phoneNumberCountry")).click();
        new Select(driver.findElement(By.name("phoneNumberCountry"))).selectByVisibleText("United Kingdom");
        driver.findElement(By.name("phoneNumber")).click();
        driver.findElement(By.name("phoneNumber")).clear();
        driver.findElement(By.name("phoneNumber")).sendKeys("07399444057");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}
