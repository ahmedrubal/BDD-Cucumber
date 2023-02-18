package StepDefPackage;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class Amazon {
    public WebDriver driver;
    @Given("^User will navigate to amazon$")
    public void User_will_navigate_to_amazon (){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https:www.amazon.com");

    }
    @And("^User will get link$")
    public void User_will_get_link(){
        System.out.println("i am getting text");

    }
    @When("^User will clicks on the link$")
    public void User_will_clicks_on_the_link(){
        System.out.println("i clicked on ");

    }
    @Then("^User will navigate back to HomePage$")
    public void User_will_navigate_back_to_HomePage(){
        System.out.println(" i got text");
        driver.close();

    }



}
