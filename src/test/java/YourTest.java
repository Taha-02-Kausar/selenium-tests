import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class YourTest {

    WebDriver driver;

    @Before
    public void setUp() {
        // WebDriverManager automatically sets up the ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() {
        // Open Google's website
        driver.get("https://www.google.com");
        
        // Get the title of the page and assert it contains "Google"
        String title = driver.getTitle();
        assertTrue(title.contains("Google"));
    }

    @After
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}
