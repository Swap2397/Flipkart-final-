package support;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class temp7 
{
	@Given("user open {string} browser with exe {string}")
	public void user_open_browser_with_exe(String string, String string2) {
		  Object[]input=new Object[2];
		    input[0]=string;
		    input[1]=string2;                                      //open the browser
		    temp8.blaunch(input);
	}

	@Given("user open url as {string}")
	public void user_open_url_as(String string) {
		  Object[]input1=new Object[1];
		  input1[0]=string;                                       //open the url
		  temp8.openlaunch(input1);
	}

	@When("user use implicit wait")
	public void user_use_implicit_wait() {
		temp8.wait1();                           //use of implicit wait
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
		Object[]input2=new Object[2];
		   input2[0]="//*[@id='txtuId']"; 
		    input2[1]="Admin";
		    temp8.enteruser(input2);                               //enter username
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String string) {
		Object[]input3=new Object[2];
	    input3[0]="//*[@id='txtPword']";  
	   input3[1]="Admin";                                           //enter password
	   temp8.enteruser(input3);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		Object[]input4=new Object[1];                           //click on login
	    input4[0]="//*[@id='login']";
	    temp8. clickloging(input4);
	}

	@When("user click on branches button")
	public void user_click_on_branches_button() {
		Object[]input5=new Object[1];                      //click on branches button
	    input5[0]="(//*[@height='24'])[2]";
	    temp8.clickloging(input5);
	}

	@When("user click on country dropdown")
	public void user_click_on_country_dropdown() {
		Object[]input6=new Object[1];                      //click on country dropdown
	    input6[0]="//*[@id='lst_countryS']";
	    temp8. clickloging(input6);
	}

	@When("user select country as {string}")
	public void user_select_country_as(String string) {
		Object[]input7=new Object[2];  
		input7[0]="//*[@id='lst_countryS']";//click on country india
	    input7[1]=string;
	    temp8.clickoncoun(input7);
	}

	@When("user click on state dropdown")
	public void user_click_on_state_dropdown() {
		Object[]input8=new Object[1];                    //click on state dropdown
	    input8[0]="//*[@id='lst_stateS']";
	    temp8.clickloging(input8);
	}

	@When("user select state as {string}")
	public void user_select_state_as(String string) {
		 Object[]input71=new Object[2];
		    input71[0]="//*[@id='lst_stateS']";        //click on state maharashtra
		    input71[1]=string;
		    temp8.clickoncoun(input71);;
	}

	@When("user click on city dropdown")
	public void user_click_on_city_dropdown() {
		Object[]input9=new Object[1];                    //click on city dropdown
	    input9[0]="//*[@id='lst_cityS']";
	    temp8.clickloging(input9);
	}

	@When("user select city as {string}")
	public void user_select_city_as(String string) {
		Object[]input91=new Object[2];                    //click on city mumbai
	    input91[0]="//*[@id='lst_cityS']";           
	    input91[1]=string;
	    temp8.clickoncoun(input91);
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		Object[]input10=new Object[1];
	    input10[0]="//*[@id='btn_search']";     // //click on search button
	    temp8.clickloging(input10);
	}

	@Then("validate if user is login successful")
	public void validate_if_user_is_login_successful() {
		System.out.println("login successful");
	}


}
