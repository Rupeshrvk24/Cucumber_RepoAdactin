package com.adactin.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDef {
WebDriver driver = TestRunner.driver;

@Given("^User launch the Adactin Application$")
public void user_launch_the_Adactin_Application() throws Throwable {
driver.get("https://adactinhotelapp.com");
}

@When("^User Enter The UserNAme in UserName Field$")
public void user_Enter_The_UserNAme_in_UserName_Field() throws Throwable {
	WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
	Username.sendKeys("RupeshRaju");
}

@When("^User Enter the Password In Password Field$")
public void user_Enter_the_Password_In_Password_Field() throws Throwable {
	WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
	Pwd.sendKeys("836898");
}

@Then("^user Click the Login Button And it Navigate To Next Page$")
public void user_Click_the_Login_Button_And_it_Navigate_To_Next_Page() throws Throwable {
	WebElement LgnCl = driver.findElement(By.xpath("//input[@name='login']"));
	LgnCl.click();
}

@When("^user select the location from location dropdown$")
public void user_select_the_location_from_location_dropdown() throws Throwable {
	WebElement Loct = driver.findElement(By.xpath("//select[@name='location']"));
	Select a = new Select(Loct);
	a.selectByIndex(2);
}

@When("^user select the Hotel from Hotel dropdown$")
public void user_select_the_Hotel_from_Hotel_dropdown() throws Throwable {
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select b = new Select(hotel);
	b.selectByValue("Hotel Creek");
}

@When("^user select the room  type$")
public void user_select_the_room_type() throws Throwable {
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select c = new Select(room);
	c.selectByVisibleText("Deluxe");
}

@When("^user select the number of rooms$")
public void user_select_the_number_of_rooms() throws Throwable {
	WebElement rmnub = driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select d = new Select(rmnub);
	d.selectByIndex(5);
}

@When("^user select the number of adults$")
public void user_select_the_number_of_adults() throws Throwable {
	WebElement Adperoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select e = new Select(Adperoom);
	e.selectByIndex(3);
}

@When("^user select the number of childrens$")
public void user_select_the_number_of_childrens() throws Throwable {
	WebElement Chperoom = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select f = new Select(Chperoom);
	f.selectByVisibleText("2 - Two");
}

@Then("^user click the search button and it navigate to select hotel page$")
public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() throws Throwable {
	WebElement Srch = driver.findElement(By.xpath("//input[@type='submit']"));
	Srch.click();
}

@When("^User click the required Hotel from the Select column$")
public void user_click_the_required_Hotel_from_the_Select_column() throws Throwable {
	WebElement Rd1 = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	Rd1.click();
}

@When("^user click the COntinue button and it navigate to Book a Hotel page$")
public void user_click_the_COntinue_button_and_it_navigate_to_Book_a_Hotel_page() throws Throwable {
	WebElement Cont = driver.findElement(By.xpath("//input[@name='continue']"));
	Cont.click();
}

@Given("^User enters First Name in First name box$")
public void user_enters_First_Name_in_First_name_box() throws Throwable {
	WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
	Fname.sendKeys("Rupesh");
}

@Given("^User enters Last Name in Last name box$")
public void user_enters_Last_Name_in_Last_name_box() throws Throwable {
	WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
	Lname.sendKeys("Raju");
}

@Given("^User enters Billing address in Billing address box$")
public void user_enters_Billing_address_in_Billing_address_box() throws Throwable {
	WebElement addres = driver.findElement(By.xpath("//textarea[@name='address']"));
	addres.sendKeys("Rajajinagar, Bangalore");
}

@Given("^User enter Credit (\\d+) digit credit card number in Credit card box$")
public void user_enter_Credit_digit_credit_card_number_in_Credit_card_box(int arg1) throws Throwable {
	WebElement ccN = driver.findElement(By.xpath("//input[@name='cc_num']"));
	ccN.sendKeys("1234567891234567");
}

@Given("^User select the Credit card type from drop down box$")
public void user_select_the_Credit_card_type_from_drop_down_box() throws Throwable {
	WebElement ccT = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select g = new Select(ccT);
	g.selectByVisibleText("Master Card");
}

@Given("^User select the Expiry date and Expiry Date from drop down box$")
public void user_select_the_Expiry_date_and_Expiry_Date_from_drop_down_box() throws Throwable {
	WebElement cc_exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select h = new Select(cc_exp);
	h.selectByIndex(11);
	
	WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select i = new Select(year);
	i.selectByVisibleText("2021");
}

@Given("^User Enters CVV number in CVV box$")
public void user_Enters_CVV_number_in_CVV_box() throws Throwable {
	WebElement cVV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cVV.sendKeys("987654321");
}

@Then("^User clicks Book Now button and it navigate to Booking Confirmation page$")
public void user_clicks_Book_Now_button_and_it_navigate_to_Booking_Confirmation_page() throws Throwable {
	WebElement bknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	bknow.click();
	Thread.sleep(5000);
}

@Then("^It navigates to Booked Iternerary page$")
public void it_navigates_to_Booked_Iternerary_page() throws Throwable {
	WebElement Iter = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
	Iter.click();
	Thread.sleep(3000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File s = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\Jyothi\\eclipse-workspace\\Cucumber_Concept\\Screen_shot_cucumber\\SS-1.png");
//	FileHandler.copy(s, f);
	FileUtils.copyFile(s, f);	
	
}

@Then("^User clicks the logout button and the application will be closed$")
public void user_clicks_the_logout_button_and_the_application_will_be_closed() throws Throwable {
	WebElement lgout = driver.findElement(By.xpath("//input[@name=\"logout\"]"));
	lgout.click();
}



}
