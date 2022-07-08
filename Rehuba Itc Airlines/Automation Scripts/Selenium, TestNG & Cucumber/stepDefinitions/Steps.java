package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;
import static org.testng.Assert.fail;
import org.junit.Assert;
import junit.framework.*;

public class Steps {
	WebDriver d;
		@Given("user is on Login Page")
		public void login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.adactinhotelapp.com/");
		    System.out.println("Login page");
		}
		@When("title of login page is Adactin Hotel")
		public void title_of_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(d.getTitle());
		}
		@When("user enters username and password")
		public void username_and_password() {
		    // Write code here that turns the phrase above into concrete actions
			d.findElement(By.id("username")).sendKeys("Rajasekhar1234");
			d.findElement(By.id("password")).sendKeys("Raja@1234");
			System.out.println("Login credentials entered");
		}
		
		@Then("user is on the home page")
		public void home_page() {
			String expUrl = "https://www.adactinhotelapp.com/SearchHotel.php";
			String actUrl = d.getCurrentUrl();
			if(!expUrl.equals(actUrl)) {
				fail("It did not navigated to Homepage");
			}
		    d.quit();
		    System.out.println("Closed"); 
		}
						
		@And("user clicks on login button")
		public void user_clicks_on_login_button() {
			d.findElement(By.id("login")).click();
			System.out.println("Login button clicked");
		}
		
		@Given("user is on home page")
		public void homePage() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.adactinhotelapp.com/");
			d.findElement(By.id("username")).sendKeys("Rajasekhar1234");
			d.findElement(By.id("password")).sendKeys("Raja@1234");
			System.out.println("Login credentials entered");
		    System.out.println("Home page");
		}
		@When("user enters search details")
		public void searchHotel() {
		  Select dLoc= new Select(d.findElement(By.xpath("//select[@id='location']")));
		  dLoc.selectByIndex(1);
		  Select dHotels= new Select(d.findElement(By.xpath("//select[@id='location']")));
		  dHotels.selectByIndex(2);
		  Select dRoomType= new Select(d.findElement(By.xpath("//select[@id='location']")));
		  dRoomType.selectByIndex(3);
		  Select dNrooms= new Select(d.findElement(By.xpath("//select[@id='location']")));
		  dNrooms.selectByIndex(2);
			
			
			
		}
		
		@Then("user is on select hotel page")
		public void selectHotel() {
		  
		}

					
	}